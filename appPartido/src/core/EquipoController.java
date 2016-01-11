/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import static core.DirectorTecnicoController.objDt;
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
public class EquipoController {
    
   public static List<Equipo> lEquipo=new ArrayList<Equipo>();
   
   public static void equipoInicial(){
   
       Equipo equipo1=new Equipo();
       equipo1.setNombre("Colo Colo");
       equipo1.setDirectorTecnico(DirectorTecnicoController.getDirectorTecnico(0));
       
       Equipo equipo2=new Equipo();
       equipo2.setNombre("Universidad de chile");
       equipo2.setDirectorTecnico(DirectorTecnicoController.getDirectorTecnico(1));
        lEquipo.add(equipo1);
        lEquipo.add(equipo2);
   }
   
   public static void agregaEquipo(Equipo equipo){
   
         List<Equipo> dtFilter= lEquipo.stream().filter(x->x.getNombre().equals(equipo.getNombre())).collect(Collectors.toList());
        if(dtFilter.size()>0){
            lEquipo.remove(dtFilter.get(0));
        }              
        lEquipo.add(equipo);
   }
    
    public  static Equipo getEquipo(String nombre){
   
         List<Equipo> dtFilter= lEquipo.stream().filter(x->x.getNombre().equals(nombre)).collect(Collectors.toList());
        if(dtFilter.size()>0){
         return dtFilter.get(0);
        }              
       return null;
   }
    
      public static void  eliminaEquipo(String nombre){
       List<Equipo> dtFilter= lEquipo.stream().filter(x->x.getNombre().equals(nombre)).collect(Collectors.toList());
       if(dtFilter.size()>0){
         lEquipo.remove(dtFilter.get(0));
       }
       
    
    }
    
    
      public  static Equipo getEquipo(int index){
  
              
       return lEquipo.get(index);
   }
    
    public static DefaultListModel  getLlistModel(){
         DefaultListModel model = new DefaultListModel();
       
         for (Equipo equipo : lEquipo) {
              model.addElement(equipo.getNombre());
         }
              
         return model;
    }
    
      public static DefaultComboBoxModel getComboBoxModel(){
     
       DefaultComboBoxModel model = new DefaultComboBoxModel();
          for (Equipo equipo : lEquipo) {
              model.addElement(equipo.getNombre());
         }
       
        return model;
     }
     
   
}
