/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import static core.EquipoController.lEquipo;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import modelo.*;
/**
 *
 * @author Miguel Castillo
 */
public class JugadoresController {
    
   

   public static void agregarArquero(Arquero arquero,int equipoIndex){
   
    Equipo equipo=EquipoController.getEquipo(equipoIndex);
    
    if(equipo.getArqueros()==null){
        ArrayList<Arquero> arq=new ArrayList<Arquero>();
        equipo.setArqueros(arq);
    }
    
     if(equipo.getArqueros().size()>0){
     List<Arquero> arqueros=  equipo.getArqueros();
     List<Arquero> Filter= arqueros.stream().filter(x->x.getRut().equals(arquero.getRut())).collect(Collectors.toList());
     if(Filter.size()>0){   
     arqueros.remove(Filter.get(0));
    }
     
    }
   
  
   equipo.getArqueros().add(arquero);
   
   
   }
   
   
   public static void agregarDefensa(Defensa defensa,int equipoIndex){
   
    Equipo equipo=EquipoController.getEquipo(equipoIndex);
    
    if(equipo.getDefensas()==null){
        ArrayList<Defensa> def=new ArrayList<Defensa>();
        equipo.setDefensas(def);
    }
    
     if(equipo.getDefensas().size()>0){
     List<Defensa> defensas=  equipo.getDefensas();
     List<Defensa> Filter= defensas.stream().filter(x->x.getRut().equals(defensa.getRut())).collect(Collectors.toList());
     if(Filter.size()>0){   
     defensas.remove(Filter.get(0));
    }     
    }
   equipo.getDefensas().add(defensa);
  
   }
   
   
      public static void agregarDelantero(Delantero delantero,int equipoIndex){
   
    Equipo equipo=EquipoController.getEquipo(equipoIndex);
    
    if(equipo.getDelanteros()==null){
        ArrayList<Delantero> del=new ArrayList<Delantero>();
        equipo.setDelanteros(del);
    }
    
     if(equipo.getDelanteros().size()>0){
     List<Delantero> delanteros=  equipo.getDelanteros();
     List<Delantero> Filter= delanteros.stream().filter(x->x.getRut().equals(delantero.getRut())).collect(Collectors.toList());
     if(Filter.size()>0){   
     delanteros.remove(Filter.get(0));
    }     
    }
   equipo.getDelanteros().add(delantero);
  
   }
   
   
   
         public static void agregarVolante(Volante volante,int equipoIndex){
   
    Equipo equipo=EquipoController.getEquipo(equipoIndex);
    
    if(equipo.getVolantes()==null){
        ArrayList<Volante> vol=new ArrayList<Volante>();
        equipo.setVolantes(vol);
    }
    
     if(equipo.getVolantes().size()>0){
     List<Volante> volantes=  equipo.getVolantes();
     List<Volante> Filter= volantes.stream().filter(x->x.getRut().equals(volante.getRut())).collect(Collectors.toList());
     if(Filter.size()>0){   
     volantes.remove(Filter.get(0));
    }     
    }
   equipo.getVolantes().add(volante);
  
   }
   
   
   
   
   
     public static void removeRowsTable(DefaultTableModel model) {
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
   
   public static void doTableJugadores(javax.swing.JTable jTableClientes) {
        String registros[]       = new String[6];
        DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
        removeRowsTable(modelo);
                                             
            for(Equipo equipo:EquipoController.lEquipo)   {
            
                
                if(equipo.getArqueros()!=null){
                  for(Arquero arquero:equipo.getArqueros())   {
                   registros[0] = arquero.getRut();
                   registros[1] = arquero.getNombres()+" "+arquero.getApellidoPaterno()+" "+arquero.getApellidoMaterno();
                   registros[2] = String.valueOf(arquero.getNumero());
                   registros[3] = "Arquero";
                   registros[4] = equipo.getNombre();
                   registros[5] = arquero.getTitular()==true?"SI":"NO";
                   modelo.addRow(registros);
                      
                  }
                }
                
                
                if(equipo.getDefensas()!=null){
                  for(Defensa defensa:equipo.getDefensas())   {
                   registros[0] = defensa.getRut();
                   registros[1] = defensa.getNombres()+" "+defensa.getApellidoPaterno()+" "+defensa.getApellidoMaterno();
                   registros[2] = String.valueOf(defensa.getNumero());
                   registros[3] = "Defensa";
                   registros[4] = equipo.getNombre();
                    registros[5] = defensa.getTitular()==true?"SI":"NO";
                   modelo.addRow(registros);
                      
                  }
                }
                
                if(equipo.getDelanteros()!=null){
                    for(Delantero delantero:equipo.getDelanteros())   {
                   registros[0] = delantero.getRut();
                   registros[1] = delantero.getNombres()+" "+delantero.getApellidoPaterno()+" "+delantero.getApellidoMaterno();
                   registros[2] = String.valueOf(delantero.getNumero());
                   registros[3] = "Delantero";
                   registros[4] = equipo.getNombre();
                    registros[5] = delantero.getTitular()==true?"SI":"NO";
                   modelo.addRow(registros);                      
                  }
                }
                
                
                if(equipo.getVolantes()!=null){
                   for(Volante volante:equipo.getVolantes())   {
                   registros[0] = volante.getRut();
                   registros[1] = volante.getNombres()+" "+volante.getApellidoPaterno()+" "+volante.getApellidoMaterno();
                   registros[2] = String.valueOf(volante.getNumero());
                   registros[3] = "Volante";
                   registros[4] = equipo.getNombre();
                    registros[5] = volante.getTitular()==true?"SI":"NO";
                   modelo.addRow(registros);
                      
                  }
                }
            }    
                   
                   
    
        jTableClientes.setModel(modelo);
    }
   
 public static void doTableJugadores(javax.swing.JTable jTableClientes,int equipoIndex) {
        String registros[]       = new String[6];
        DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
        removeRowsTable(modelo);
                                             
        
            
                Equipo equipo=EquipoController.getEquipo(equipoIndex);
                if(equipo.getArqueros()!=null){
                  for(Arquero arquero:equipo.getArqueros())   {
                   registros[0] = arquero.getRut();
                   registros[1] = arquero.getNombres()+" "+arquero.getApellidoPaterno()+" "+arquero.getApellidoMaterno();
                   registros[2] = String.valueOf(arquero.getNumero());
                   registros[3] = "Arquero";
                   registros[4] = equipo.getNombre();
                   registros[5] = arquero.getTitular()==true?"SI":"NO";
                   modelo.addRow(registros);
                      
                  }
                }
                
                
                if(equipo.getDefensas()!=null){
                  for(Defensa defensa:equipo.getDefensas())   {
                   registros[0] = defensa.getRut();
                   registros[1] = defensa.getNombres()+" "+defensa.getApellidoPaterno()+" "+defensa.getApellidoMaterno();
                   registros[2] = String.valueOf(defensa.getNumero());
                   registros[3] = "Defensa";
                   registros[4] = equipo.getNombre();
                    registros[5] = defensa.getTitular()==true?"SI":"NO";
                   modelo.addRow(registros);
                      
                  }
                }
                
                if(equipo.getDelanteros()!=null){
                    for(Delantero delantero:equipo.getDelanteros())   {
                   registros[0] = delantero.getRut();
                   registros[1] = delantero.getNombres()+" "+delantero.getApellidoPaterno()+" "+delantero.getApellidoMaterno();
                   registros[2] = String.valueOf(delantero.getNumero());
                   registros[3] = "Delantero";
                   registros[4] = equipo.getNombre();
                    registros[5] = delantero.getTitular()==true?"SI":"NO";
                   modelo.addRow(registros);                      
                  }
                }
                
                
                if(equipo.getVolantes()!=null){
                   for(Volante volante:equipo.getVolantes())   {
                   registros[0] = volante.getRut();
                   registros[1] = volante.getNombres()+" "+volante.getApellidoPaterno()+" "+volante.getApellidoMaterno();
                   registros[2] = String.valueOf(volante.getNumero());
                   registros[3] = "Volante";
                   registros[4] = equipo.getNombre();
                    registros[5] = volante.getTitular()==true?"SI":"NO";
                   modelo.addRow(registros);
                      
                  }
                }
                   
    
        jTableClientes.setModel(modelo);
    }
    
    public static void agregarJugador(Object object,String tipo,int equipoIndex){
    
    switch(tipo){
    
        case "Arquero":
            agregarArquero((Arquero)object,equipoIndex);
        break;
        
        case "Defensa":
            
        break;
        
        case "Volante":
            
        break;
    
         case "Delantero":
            
        break;
    }
    
    }
    
//    public static List<Arquero> arqueros =new ArrayList<Arquero>();
//    public static List<Defensa> defensas =new ArrayList<Defensa>();
//    public static List<Delantero> delanteros =new ArrayList<Delantero>();
//    
//    
    
    
}
