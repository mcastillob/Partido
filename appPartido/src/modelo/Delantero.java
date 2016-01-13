package modelo;


public class Delantero extends Jugador  implements java.io.Serializable{
static final long serialVersionUID = 42L;
 
    private Equipo Equipo;

   
    public Delantero () {
    }

    
    public void Atacar () {
    }

    
    public Equipo getEquipo () {
        return Equipo;
    }

    
    public void setEquipo (Equipo val) {
        this.Equipo = val;
    }

}

