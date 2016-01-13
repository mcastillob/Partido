package modelo;
import java.util.ArrayList; 


public class Equipo  implements java.io.Serializable{
static final long serialVersionUID = 42L;
    
    private String nombre;

    
    private int goles;

    private ArrayList<Arquero> Arqueros;
    
    
    private ArrayList<Delantero> Delanteros;

     
    private DirectorTecnico DirectorTecnico;

    
    private ArrayList<Defensa> Defensas;

    
    private ArrayList<Volante> Volantes;

    
    public Equipo () {
    }

     

    public ArrayList<Arquero> getArqueros() {
        return Arqueros;
    }

    public void setArqueros(ArrayList<Arquero> Arqueros) {
        this.Arqueros = Arqueros;
    }
 

    
    public ArrayList<Defensa> getDefensas () {
        return Defensas;
    }

    
    public void setDefensas (ArrayList<Defensa> val) {
        this.Defensas = val;
    }

    
    public ArrayList<Volante> getVolantes () {
        return Volantes;
    }

    
    public void setVolantes (ArrayList<Volante> val) {
        this.Volantes = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.50B9F999-9A81-5794-8B6F-1BA29F1BDCB7]
    // </editor-fold> 
    public ArrayList<Delantero> getDelanteros () {
        return Delanteros;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B942363F-E0C5-0A17-985D-DC774178AE74]
    // </editor-fold> 
    public void setDelanteros (ArrayList<Delantero> val) {
        this.Delanteros = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B774E055-13FC-9591-9763-83FB50E11CAA]
    // </editor-fold> 
    public DirectorTecnico getDirectorTecnico () {
        return DirectorTecnico;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F9BDF547-A64D-5FEC-4366-170461332585]
    // </editor-fold> 
    public void setDirectorTecnico (DirectorTecnico val) {
        this.DirectorTecnico = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2A59579F-91CA-8F5F-DBB2-2BE3C4A0BA25]
    // </editor-fold> 
    public int getGoles () {
        return goles;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.104EF783-E8C4-6D6D-C067-3ED4A3A4FDA1]
    // </editor-fold> 
    public void setGoles (int val) {
        this.goles = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.64DD280E-0C0F-2DB9-CA3B-9A015BA81452]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5F71F28F-31A2-DE42-B5F3-BC1DF844DD65]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

}

