package modelo;


public class Cambio  implements java.io.Serializable{
static final long serialVersionUID = 42L;
   
    private int FechaHora;

   
    private Jugador JugadorRetirado;

    
    private Jugador JugadorEntrante;

    
    public Cambio () {
    }

    
    public int getFechaHora () {
        return FechaHora;
    }

    
    public void setFechaHora (int val) {
        this.FechaHora = val;
    }

    
    public Jugador getJugadorEntrante () {
        return JugadorEntrante;
    }

  
    public void setJugadorEntrante (Jugador val) {
        this.JugadorEntrante = val;
    }

    
    public Jugador getJugadorRetirado () {
        return JugadorRetirado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.61888AB5-D57C-2BB6-5855-92FEA5368A31]
    // </editor-fold> 
    public void setJugadorRetirado (Jugador val) {
        this.JugadorRetirado = val;
    }

}

