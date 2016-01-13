package modelo;


public class Defensa extends Jugador  implements java.io.Serializable{
static final long serialVersionUID = 42L;
    
    private Equipo Equipo;

    
    public Defensa () {
    }

    
    public void Defender () {
    }

    public Equipo getEquipo () {
        return Equipo;
    }

    
    public void setEquipo (Equipo val) {
        this.Equipo = val;
    }

}

