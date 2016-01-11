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
    
    public static List<Jugador> objJugador=new ArrayList<>();
    public static Equipo colocolo=lEquipo.get(0);
    public static Equipo uchile=lEquipo.get(1);
    public static Equipo wanderers=lEquipo.get(2);
    public static Equipo cobreloa=lEquipo.get(3);
    
    
    public static void JugadoresInicial(){
        
        
        //Este es un comentario de ejemplo
        
        //LOAD Jugadores in Colo-Colo
        Jugador jg1=new Jugador();
        jg1.setNombres("Francisco");
        jg1.setApellidoPaterno("Valdes");
        jg1.setApellidoMaterno("Perez");
        jg1.setEquipo(colocolo);
        jg1.setTitular(false);
        
        Jugador jg2=new Jugador();
        jg1.setNombres("Carlos");
        jg1.setApellidoPaterno("Caszely");
        jg1.setApellidoMaterno("Garrido");
        jg1.setEquipo(colocolo);
        jg1.setTitular(true);
        
        objJugador.add(jg1);
        objJugador.add(jg2);
                
        //LOAD Jugadores in U Chile
        Jugador jg3=new Jugador();
        jg1.setNombres("Manuel");
        jg1.setApellidoPaterno("Rodríguez");
        jg1.setApellidoMaterno("Vega");
        jg1.setEquipo(uchile);
        jg1.setTitular(false);
        
        Jugador jg4=new Jugador();
        jg1.setNombres("Marcelo");
        jg1.setApellidoPaterno("Salas");
        jg1.setApellidoMaterno("Melinao");
        jg1.setEquipo(uchile);
        jg1.setTitular(true);
        
        objJugador.add(jg3);
        objJugador.add(jg4);
        
        //LOAD Jugadores in S. Wanderers
        Jugador jg5=new Jugador();
        jg1.setNombres("Mauricio");
        jg1.setApellidoPaterno("Rojas");
        jg1.setApellidoMaterno("Toro");
        jg1.setEquipo(wanderers);
        jg1.setTitular(false);
        
        Jugador jg6=new Jugador();
        jg1.setNombres("Claudio");
        jg1.setApellidoPaterno("Borghi");
        jg1.setApellidoMaterno("Bidos");
        jg1.setEquipo(wanderers);
        jg1.setTitular(true);
        
        objJugador.add(jg5);
        objJugador.add(jg6);
        
        //LOAD Jugadores in Cobreloa
         Jugador jg7=new Jugador();
        jg1.setNombres("Eduardo");
        jg1.setApellidoPaterno("Vargas");
        jg1.setApellidoMaterno("Rojas");
        jg1.setEquipo(wanderers);
        jg1.setTitular(false);
        
        Jugador jg8=new Jugador();
        jg1.setNombres("Alexis");
        jg1.setApellidoPaterno("Sánchez");
        jg1.setApellidoMaterno("Sánchez");
        jg1.setEquipo(wanderers);
        jg1.setTitular(true);
        
        objJugador.add(jg7);
        objJugador.add(jg8);
        
    }
    
   
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
