package modelo;
import java.util.ArrayList; 


public class Campeonato   implements java.io.Serializable{
static final long serialVersionUID = 42L;
    
    private ArrayList<Partido> Partidos;

    
    public Campeonato () {
    }

    
    public ArrayList<Partido> getPartidos () {
        return Partidos;
    }

    
    public void setPartidos (ArrayList<Partido> val) {
        this.Partidos = val;
    }

}

