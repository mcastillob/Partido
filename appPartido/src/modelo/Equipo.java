package modelo;
import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CCFAF257-86CE-F99E-286F-7D613AF0304E]
// </editor-fold> 
public class Equipo  implements java.io.Serializable{
static final long serialVersionUID = 42L;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F4C0228D-2463-FFD8-35AA-080D3C6EB018]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.398E2D6D-E25C-4B88-8F24-2E13C283BCAD]
    // </editor-fold> 
    private int goles;

    private ArrayList<Arquero> Arqueros;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E400244D-CFAC-4A24-049B-9E74CEE3625F]
    // </editor-fold> 
    private ArrayList<Delantero> Delanteros;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FDA093D1-DA1B-CE44-549F-BAE993C2A7FA]
    // </editor-fold> 
    private DirectorTecnico DirectorTecnico;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0F739238-325E-BCE1-EDDE-73C8DEC2B7D6]
    // </editor-fold> 
    private ArrayList<Defensa> Defensas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.768A476F-0D60-3B50-1633-E4E1A8CC1FEE]
    // </editor-fold> 
    private ArrayList<Volante> Volantes;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.109C748C-3F5D-A18F-E746-DE0A10A9626B]
    // </editor-fold> 
    public Equipo () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E32D0213-D939-1C30-4D3F-430F81D3E381]
    // </editor-fold> 

    public ArrayList<Arquero> getArqueros() {
        return Arqueros;
    }

    public void setArqueros(ArrayList<Arquero> Arqueros) {
        this.Arqueros = Arqueros;
    }
 

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1B62E9F1-8FD9-688D-473D-32E5B392C4FE]
    // </editor-fold> 
    public ArrayList<Defensa> getDefensas () {
        return Defensas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1ADB1B42-13A1-824D-A880-21D5F1603E7E]
    // </editor-fold> 
    public void setDefensas (ArrayList<Defensa> val) {
        this.Defensas = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D843A071-75D1-E8BC-1011-FE1CCE47043F]
    // </editor-fold> 
    public ArrayList<Volante> getVolantes () {
        return Volantes;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.65F75335-DDD1-E965-3D39-708B5132BA9F]
    // </editor-fold> 
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

