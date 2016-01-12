/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import modelo.*;
/**
 *
 * @author Miguel Castillo
 */
public class JugadoresController  implements java.io.Serializable{
    
    public  ArrayList<Jugador> objJugador=new ArrayList<>();
    
    private static JugadoresController intance; 
    
    public static JugadoresController getInstance(){
      //deserializa los datos y loscarga en el singleton
     SerializadorUtil<JugadoresController> Seri=new SerializadorUtil<JugadoresController>(JugadoresController.class);
     intance=Seri.readObj();
     
     if(intance==null){
     intance=new JugadoresController(); 
     }
     
      return intance;   
   }
        
    public void grabar(){        
      SerializadorUtil<JugadoresController> Seri=new SerializadorUtil<JugadoresController>(JugadoresController.class);
      Seri.writeObj(this.intance);    
     }
    
    
    
    
//    public static Equipo colocolo=lEquipo.get(0);
//    public static Equipo uchile=lEquipo.get(1);
//    public static Equipo wanderers=lEquipo.get(2);
//    public static Equipo cobreloa=lEquipo.get(3);
    
//    public static void JugadoresInicial(){       
//                
//        //LOAD Jugadores in Colo-Colo
//        Jugador jg1=new Jugador();
//        jg1.setRut("8995413-4");
//        jg1.setNombres("Francisco");
//        jg1.setApellidoPaterno("Valdes");
//        jg1.setApellidoMaterno("Perez");
//        jg1.setNumero(10);
//        jg1.setEquipo(colocolo);
//        jg1.setTitular(false);
//        
//        Jugador jg2=new Jugador();
//        jg2.setRut("21896929-1");
//        jg2.setNombres("Carlos");
//        jg2.setApellidoPaterno("Caszely");
//        jg2.setApellidoMaterno("Garrido");
//        jg2.setNumero(35);
//        jg2.setEquipo(colocolo);
//        jg2.setTitular(true);
//        
//        objJugador.add(jg1);
//        objJugador.add(jg2);
//                
//        //LOAD Jugadores in U Chile
//        Jugador jg3=new Jugador();
//        jg3.setRut("22599054-9");
//        jg3.setNombres("Manuel");
//        jg3.setApellidoPaterno("Rodríguez");
//        jg3.setApellidoMaterno("Vega");
//        jg3.setNumero(1);
//        jg3.setEquipo(uchile);
//        jg3.setTitular(false);
//        
//        Jugador jg4=new Jugador();
//        jg4.setRut("15516797-1");
//        jg4.setNombres("Marcelo");
//        jg4.setApellidoPaterno("Salas");
//        jg4.setApellidoMaterno("Melinao");
//        jg2.setNumero(9);
//        jg4.setEquipo(uchile);
//        jg4.setTitular(true);
//        
//        objJugador.add(jg3);
//        objJugador.add(jg4);
//        
//        
//        
//        //LOAD Jugadores in S. Wanderers
//        Jugador jg5=new Jugador();
//        jg5.setRut("5268495-1");
//        jg5.setNombres("Mauricio");
//        jg5.setApellidoPaterno("Rojas");
//        jg5.setApellidoMaterno("Toro");
//        jg5.setNumero(20);
//        jg5.setEquipo(wanderers);
//        jg5.setTitular(false);
//        
//        Jugador jg6=new Jugador();
//        jg6.setRut("24432325-1");
//        jg6.setNombres("Claudio");
//        jg6.setApellidoPaterno("Borghi");
//        jg6.setApellidoMaterno("Bidos");
//        jg6.setNumero(15);
//        jg6.setEquipo(wanderers);
//        jg6.setTitular(true);
//        
//        objJugador.add(jg5);
//        objJugador.add(jg6);
//        
//        //LOAD Jugadores in Cobreloa
//         Jugador jg7=new Jugador();
//        jg7.setRut("8801551-7");
//        jg7.setNombres("Eduardo");
//        jg7.setApellidoPaterno("Vargas");
//        jg7.setApellidoMaterno("Rojas");
//        jg7.setNumero(4);
//        jg7.setEquipo(wanderers);
//        jg7.setTitular(false);
//        
//        Jugador jg8=new Jugador();
//        jg8.setRut("8801551-7");
//        jg8.setNombres("Alexis");
//        jg8.setApellidoPaterno("Sánchez");
//        jg8.setApellidoMaterno("Sánchez");
//        jg8.setNumero(7);
//        jg8.setEquipo(wanderers);
//        jg8.setTitular(true);
//                
//        objJugador.add(jg7);
//        objJugador.add(jg8);
//        
//        
//        
//         
//        
//    } 
   
   public  void agregarArquero(Arquero arquero,int equipoIndex){
       Equipo equipo=EquipoController.getInstance().getEquipo(equipoIndex);    
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
   EquipoController.getInstance().agregaEquipo(equipo);   
   grabar();
   }   
   
   public  void agregarDefensa(Defensa defensa,int equipoIndex){
   
    Equipo equipo=EquipoController.getInstance().getEquipo(equipoIndex);
    
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
    EquipoController.getInstance().agregaEquipo(equipo);  
    grabar();
 }
   
   
      public  void agregarDelantero(Delantero delantero,int equipoIndex){
   
    Equipo equipo=EquipoController.getInstance().getEquipo(equipoIndex);
    
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
    EquipoController.getInstance().agregaEquipo(equipo);  
    grabar();
   }   
   
   
    public  void agregarVolante(Volante volante,int equipoIndex){
   
    Equipo equipo=EquipoController.getInstance().getEquipo(equipoIndex);
    
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
    EquipoController.getInstance().agregaEquipo(equipo);  
    grabar();
   }  
   
     public static void removeRowsTable(DefaultTableModel model) {
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
   
   public  void doTableJugadores(javax.swing.JTable jTableClientes) {
        String registros[]       = new String[6];
        DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
        removeRowsTable(modelo);
                                             
            for(Equipo equipo:EquipoController.getInstance().lEquipo)   {
            
                
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
   
 public  void doTableJugadores(javax.swing.JTable jTableClientes,int equipoIndex) {
        String registros[]       = new String[6];
        DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
        removeRowsTable(modelo);
                                             
        
            
                Equipo equipo=EquipoController.getInstance().getEquipo(equipoIndex);
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
    
    public  void agregarJugador(Object object,String tipo,int equipoIndex){
    
        switch(tipo){

            case "Arquero":
                agregarArquero((Arquero)object,equipoIndex);
            break;

            case "Defensa":
                agregarDefensa((Defensa)object, equipoIndex);
            break;

            case "Volante":
                agregarVolante((Volante)object, equipoIndex);
            break;

            case "Delantero":
                agregarDelantero((Delantero)object, equipoIndex);
            break;
        }    
    }
    public  ArrayList<Jugador> getJugadores(){        
       return objJugador;
    }
    
    /*
    public static DefaultTableModel getTableModel(){
        DefaultTableModel t= new DefaultTableModel();
            for (Jugador j : objJugador) {
                         
            }
        return t;
    } 
    
    */

//    public static List<Arquero> arqueros =new ArrayList<Arquero>();
//    public static List<Defensa> defensas =new ArrayList<Defensa>();
//    public static List<Delantero> delanteros =new ArrayList<Delantero>();
//    
//    
    
    
}
