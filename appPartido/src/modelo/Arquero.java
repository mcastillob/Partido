package modelo;


public class Arquero extends Jugador  implements java.io.Serializable{

   
    static final long serialVersionUID = 42L;
   
    private Equipo Equipo;

    
    public Arquero () {
    }

    
    public void Atajar () {
    }

    
    public Equipo getEquipo () {
        return Equipo;
    }

   
    public void setEquipo (Equipo val) {
        this.Equipo = val;
    }


}

