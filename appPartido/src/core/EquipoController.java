/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import modelo.DirectorTecnico;
import modelo.Equipo;
/**
 *
 * @author Miguel Castillo
 */
public class EquipoController  implements  java.io.Serializable{
    static final long serialVersionUID = 42L;
    public    List<Equipo> lEquipo=new ArrayList<Equipo>();
    private static EquipoController intance; 
    
    public static EquipoController getInstance(){
      //deserializa los datos y loscarga en el singleton
     SerializadorUtil<EquipoController> Seri=new SerializadorUtil<EquipoController>(EquipoController.class);
     intance=Seri.readObj();
     
     if(intance==null){
     intance=new EquipoController(); 
     }
     
      return intance;   
   }
    
     
    public  void grabar(){  
        //serializa y graba el objeto
      SerializadorUtil<EquipoController> Seri=new SerializadorUtil<EquipoController>(EquipoController.class);
      Seri.writeObj(this.intance);    
     }
    
   

   
   public  void agregaEquipo(Equipo equipo){
       //valida si el equipo existe. en tal caso lo quita y lo agrega nuevamente para evitar duplicados
         List<Equipo> dtFilter= lEquipo.stream().filter(x->x.getNombre().equals(equipo.getNombre())).collect(Collectors.toList());
        if(dtFilter.size()>0){
            lEquipo.remove(dtFilter.get(0));
        }              
        lEquipo.add(equipo);
        grabar();
   }
    
    public   Equipo getEquipo(String nombre){
       // busca el equipo segun nombre y luego retorno el objeto equipo
         List<Equipo> dtFilter= lEquipo.stream().filter(x->x.getNombre().equals(nombre)).collect(Collectors.toList());
        if(dtFilter.size()>0){
         return dtFilter.get(0);
        }              
       return null;
   }
    
      public  void  eliminaEquipo(String nombre){
          //busca el objeto equipo y lo elimina
       List<Equipo> dtFilter= lEquipo.stream().filter(x->x.getNombre().equals(nombre)).collect(Collectors.toList());
       if(dtFilter.size()>0){
         lEquipo.remove(dtFilter.get(0));
       }
       
       grabar();
    }
    
    
      public  Equipo getEquipo(int index){
          //recupera el equipo segun posicion de la lista
          if(lEquipo.size()>index){
          return lEquipo.get(index);
          }
          
       return null;
   }
    
    public  DefaultListModel  getLlistModel(){
        
        //llena datos de en model para Jlist
         DefaultListModel model = new DefaultListModel();
       
         for (Equipo equipo : lEquipo) {
              model.addElement(equipo.getNombre());
         }
              
         return model;
    }
    
      public  DefaultComboBoxModel getComboBoxModel(){
     //llena datos de modelo para JCombobox
       DefaultComboBoxModel model = new DefaultComboBoxModel();
          for (Equipo equipo : lEquipo) {
              model.addElement(equipo.getNombre());
         }
       
        return model;
     }
     
   
}
