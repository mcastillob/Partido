package modelo;


public class Volante extends Jugador  implements java.io.Serializable{
static final long serialVersionUID = 42L;
    
    private Equipo Equipo;

    
    public Volante () {
    }

    
    public void Asistir () {
    }

    
    public Equipo getEquipo () {
        return Equipo;
    }

    
    public void setEquipo (Equipo val) {
        this.Equipo = val;
    }

}

