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
      SerializadorUtil<EquipoController> Seri=new SerializadorUtil<EquipoController>(EquipoController.class);
      Seri.writeObj(this.intance);    
     }
    
   
   
//   public static void equipoInicial(){
//   
//       Equipo equipo1=new Equipo();
//       equipo1.setNombre("Colo Colo");
//       equipo1.setDirectorTecnico(DirectorTecnicoController.intance.getDirectorTecnico(0));
//       
//       Equipo equipo2=new Equipo();
//       equipo2.setNombre("Universidad de chile");
//       equipo2.setDirectorTecnico(DirectorTecnicoController.intance.getDirectorTecnico(1));
//       
//       
//       Equipo equipo3=new Equipo();
//       equipo3.setNombre("Santiago Wanderers");
//       equipo3.setDirectorTecnico(DirectorTecnicoController.intance.getDirectorTecnico(2));
//       
//       Equipo equipo4=new Equipo();
//       equipo4.setNombre("Cobreloa");
//       equipo4.setDirectorTecnico(DirectorTecnicoController.intance.getDirectorTecnico(3));
//       
//       
//        lEquipo.add(equipo1);
//        lEquipo.add(equipo2);
//        lEquipo.add(equipo3);
//        lEquipo.add(equipo4);
//   }
   
   public  void agregaEquipo(Equipo equipo){
   
         List<Equipo> dtFilter= lEquipo.stream().filter(x->x.getNombre().equals(equipo.getNombre())).collect(Collectors.toList());
        if(dtFilter.size()>0){
            lEquipo.remove(dtFilter.get(0));
        }              
        lEquipo.add(equipo);
        grabar();
   }
    
    public   Equipo getEquipo(String nombre){
   
         List<Equipo> dtFilter= lEquipo.stream().filter(x->x.getNombre().equals(nombre)).collect(Collectors.toList());
        if(dtFilter.size()>0){
         return dtFilter.get(0);
        }              
       return null;
   }
    
      public  void  eliminaEquipo(String nombre){
       List<Equipo> dtFilter= lEquipo.stream().filter(x->x.getNombre().equals(nombre)).collect(Collectors.toList());
       if(dtFilter.size()>0){
         lEquipo.remove(dtFilter.get(0));
       }
       
       grabar();
    }
    
    
      public  Equipo getEquipo(int index){
          
          if(lEquipo.size()>index){
          return lEquipo.get(index);
          }
          
       return null;
   }
    
    public  DefaultListModel  getLlistModel(){
         DefaultListModel model = new DefaultListModel();
       
         for (Equipo equipo : lEquipo) {
              model.addElement(equipo.getNombre());
         }
              
         return model;
    }
    
      public  DefaultComboBoxModel getComboBoxModel(){
     
       DefaultComboBoxModel model = new DefaultComboBoxModel();
          for (Equipo equipo : lEquipo) {
              model.addElement(equipo.getNombre());
         }
       
        return model;
     }
     
   
}
