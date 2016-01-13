/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import modelo.*;
/**
 *
 * @author Miguel Castillo
 */
public  class DirectorTecnicoController  implements  java.io.Serializable{
    
    static final long serialVersionUID = 42L;
    private static DirectorTecnicoController intance; 
    public List<DirectorTecnico> objDt=new ArrayList<>();
    
    
    public static DirectorTecnicoController getInstance(){
      //deserializa los datos y los carga en el singleton
     SerializadorUtil<DirectorTecnicoController> Seri=new SerializadorUtil<DirectorTecnicoController>(DirectorTecnicoController.class);
     intance=Seri.readObj();
     
     if(intance==null){
         // en caso de ser la carga inicial sin datos se crea objeto
     intance=new DirectorTecnicoController(); 
     }
     
      return intance;   
   }
    
     
    private  void grabar(){   
        //registra el objeto serializado
      SerializadorUtil<DirectorTecnicoController> Seri=new SerializadorUtil<DirectorTecnicoController>(DirectorTecnicoController.class);
      Seri.writeObj(this.intance);    
     }
    
    
    
    

    public  void  agregarDT(DirectorTecnico dt){
        //busca el objeto dt segun rut en caso de que exista anteriormente
        List<DirectorTecnico> dtFilter= objDt.stream().filter(x->x.getRut().equals(dt.getRut())).collect(Collectors.toList());
        if(dtFilter.size()>0){
            //elimina el objeto dt en caso de que exista
        objDt.remove(dtFilter.get(0));
        }
        // agrega el objeto dt 
        objDt.add(dt);
        //graba los dato con serializacion
        grabar();
    }
    
    public  DirectorTecnico getDirectorTecnico(int index){    
    return objDt.get(index);
    }
    
    public  void  eliminaDT(String rut){
      List<DirectorTecnico> dtFilter= objDt.stream().filter(x->x.getRut().equals(rut)).collect(Collectors.toList());
      objDt.remove(dtFilter.get(0));
      grabar();
    }
    
     public  DefaultListModel  getLlistModel(){
         DefaultListModel model = new DefaultListModel();
      
         for (DirectorTecnico directorTecnico : objDt) {
              model.addElement(directorTecnico.getNombre()+" "+directorTecnico.getApellidoPat()+" "+directorTecnico.getApellidoMat());
         }
              
         return model;
    }
     
     public  DefaultComboBoxModel getComboBoxModel(){
    
       DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (DirectorTecnico directorTecnico : objDt) {
              model.addElement(directorTecnico.getNombre()+" "+directorTecnico.getApellidoPat()+" "+directorTecnico.getApellidoMat());
         }
       
        return model;
     }
     
     

  

     
     
       
 
    
    
}
