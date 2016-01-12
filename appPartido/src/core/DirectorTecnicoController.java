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
    //se define un singleton
    static final long serialVersionUID = 42L;
    private static DirectorTecnicoController intance; 
    
    public static DirectorTecnicoController getInstance(){
      //deserializa los datos y loscarga en el singleton
     SerializadorUtil<DirectorTecnicoController> Seri=new SerializadorUtil<DirectorTecnicoController>(DirectorTecnicoController.class);
     intance=Seri.readObj();
     
     if(intance==null){
     intance=new DirectorTecnicoController(); 
     }
     
      return intance;   
   }
    
     
    private  void grabar(){        
      SerializadorUtil<DirectorTecnicoController> Seri=new SerializadorUtil<DirectorTecnicoController>(DirectorTecnicoController.class);
      Seri.writeObj(this.intance);    
     }
    
    
    
    public List<DirectorTecnico> objDt=new ArrayList<>();
//    public  void dtInicial(){
//    
//    
//        DirectorTecnico dt1=new DirectorTecnico();
//        dt1.setRut("16122203-8");
//        dt1.setNombre("Miguel Andres");
//        dt1.setApellidoPat("Castillo");
//        dt1.setApellidoMat("Berrios");
//        
//        DirectorTecnico dt2=new DirectorTecnico();
//        dt2.setRut("1-9");
//        dt2.setNombre("Hans Christophe");
//        dt2.setApellidoPat("Escobar");
//        dt2.setApellidoMat("Escobar");
//        
//        DirectorTecnico dt3=new DirectorTecnico();
//        dt3.setRut("16015252-4");
//        dt3.setNombre("Javier");
//        dt3.setApellidoPat("Camus");
//        dt3.setApellidoMat("Velasquez");
//        
//        DirectorTecnico dt4=new DirectorTecnico();
//        dt4.setRut("17-K");
//        dt4.setNombre("Cristian");
//        dt4.setApellidoPat("Montecinos");
//        dt4.setApellidoMat("Pedrero");
//        
//        objDt.add(dt1);
//        objDt.add(dt2);
//        objDt.add(dt3);
//        objDt.add(dt4);
//    }
//    
    public  void  agregarDT(DirectorTecnico dt){
        
        List<DirectorTecnico> dtFilter= objDt.stream().filter(x->x.getRut().equals(dt.getRut())).collect(Collectors.toList());
        if(dtFilter.size()>0){
        objDt.remove(dtFilter.get(0));
        }
        objDt.add(dt);
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
