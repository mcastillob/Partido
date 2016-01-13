package modelo;


public class Tarjeta  implements java.io.Serializable{
static final long serialVersionUID = 42L;
    
    public String color;

     
    public Tarjeta () {
    }

    
    public String getColor () {
        return color;
    }

    
    public void setColor (String val) {
        this.color = val;
    }

}

