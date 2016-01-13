package modelo;
import java.util.ArrayList; 
import java.util.Date; 


public class Partido  implements java.io.Serializable{
static final long serialVersionUID = 42L;
    
    public Date Fecha;

    
    private int minutosJugados;

    
    private ArrayList<Cambio> Cambios;

    
    private ArrayList<Equipo> Equipos;

    
    public Partido () {
    }

     
    public ArrayList<Equipo> getEquipos () {
        return Equipos;
    }

    
    public void setEquipos (ArrayList<Equipo> val) {
        this.Equipos = val;
    }

     
    public ArrayList<Cambio> getCambios () {
        return Cambios;
    }

   
    public void setCambios (ArrayList<Cambio> val) {
        this.Cambios = val;
    }

    
    public Date getFecha () {
        return Fecha;
    }

     
    public void setFecha (Date val) {
        this.Fecha = val;
    }

     
    public int getMinutosJugados () {
        return minutosJugados;
    }

    
    public void setMinutosJugados (int val) {
        this.minutosJugados = val;
    }

}

