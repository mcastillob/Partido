/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import modelo.*;
/**
 *
 * @author Miguel Castillo
 */
public class JugadoresController  implements java.io.Serializable{
    static final long serialVersionUID = 42L;
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
    
    

   
   public  void agregarArquero(Arquero arquero,int equipoIndex){
       
       //agrega arquero al equipo indicado
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
   //agrega defensa al equipo indicado
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
   //agrega un delantero al equipo indicado
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
   //agrega un volante al equipo indicado
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
   
   public  void doTableJugadores(javax.swing.JTable jTableJugadores) {
       
       //carga jugadores  en modelo para Jtable 
        String registros[]       = new String[6];
        DefaultTableModel modelo = (DefaultTableModel) jTableJugadores.getModel();
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
                   
                   
    
        jTableJugadores.setModel(modelo);
    }
   
 public  void doTableJugadores(javax.swing.JTable jTableClientes,int equipoIndex) {
     
     //carga modelo con datos de jugadores para crear Jtable con los datos
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
    
    
 
    public  <T> Iterable<T> emptyIfNull(Iterable<T> iterable) {
    return iterable == null ? Collections.<T>emptyList() : iterable;
}
    
    public void EliminaJugador(String rut){
          
        //elimina el jugador 
        for (Equipo erquipo : emptyIfNull(EquipoController.getInstance().lEquipo)) {    
            
            
            
            for (Jugador jugador :  emptyIfNull(erquipo.getDefensas())) {
                
                if(jugador.getRut().equals(rut)){
                
                erquipo.getDefensas().remove(jugador);
                break;
                }
               
            }
            for (Jugador jugador :  emptyIfNull(erquipo.getArqueros())) {
                 if(jugador.getRut().equals(rut)){
                
                erquipo.getArqueros().remove(jugador);
                 break;
                }
            }     
             
            for (Jugador jugador :  emptyIfNull(erquipo.getDelanteros())) {
                 if(jugador.getRut().equals(rut)){
                
                erquipo.getDelanteros().remove(jugador);
                 break;
                }
            }  
            
             for (Jugador jugador :  emptyIfNull(erquipo.getVolantes())) {
                 if(jugador.getRut().equals(rut)){
                
                erquipo.getVolantes().remove(jugador);
                 break;
                }
            } 
             EquipoController.getInstance().agregaEquipo(erquipo); 
        }
     
    
    }
    
        public  DefaultListModel  getListTitularesModel(int equipoIndex){
          
            
            //busca todos los jugadores titulares del equipo indicado
                DefaultListModel model = new DefaultListModel();
        
            
                Equipo equipo=EquipoController.getInstance().getEquipo(equipoIndex);
                if(equipo!=null && equipo.getArqueros()!=null){
                  for(Arquero arquero:equipo.getArqueros())   {
                      if( arquero.getTitular()){
                       model.addElement("("+arquero.getNumero()+")"+arquero.getNombres()+" "+arquero.getApellidoPaterno()+" "+arquero.getApellidoMaterno());                                   
                      }
                     
                       
                  }
                }               
                
                if(equipo!=null && equipo.getDefensas()!=null){
                  for(Defensa defensa:equipo.getDefensas())   {
                       if( defensa.getTitular()){
                   model.addElement("("+defensa.getNumero()+")"+defensa.getNombres()+" "+defensa.getApellidoPaterno()+" "+defensa.getApellidoMaterno());                                   
                       }
                  }
                }
                
                if(equipo!=null && equipo.getDelanteros()!=null){
                    for(Delantero delantero:equipo.getDelanteros())   {
                         if( delantero.getTitular()){
                 model.addElement("("+delantero.getNumero()+")"+delantero.getNombres()+" "+delantero.getApellidoPaterno()+" "+delantero.getApellidoMaterno());                     
                         }
                  }
                }                
                
                if(equipo!=null &&  equipo.getVolantes()!=null){
                   for(Volante volante:equipo.getVolantes())   {
                        if( volante.getTitular()){
                   model.addElement("("+volante.getNumero()+")"+volante.getNombres()+" "+volante.getApellidoPaterno()+" "+volante.getApellidoMaterno());
                        }
                      
                  }
                }
            
            
                         
         return model;
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
