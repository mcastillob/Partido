package modelo;
import java.util.ArrayList; 
import java.util.Date; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.2674BF2F-E21A-D8E2-75E7-1E117C081FB5]
// </editor-fold> 
public class Partido  implements java.io.Serializable{
static final long serialVersionUID = 42L;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.63AD124E-3DF5-C4C2-831A-47E7AAA7F4C1]
    // </editor-fold> 
    public Date Fecha;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.124ADF66-DC01-C075-F8DD-1C63CA4CC33F]
    // </editor-fold> 
    private int minutosJugados;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9C3AC7FE-F8A3-6216-1233-46D6AB1D1709]
    // </editor-fold> 
    private ArrayList<Cambio> Cambios;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9D97DB56-4705-FE27-9F0D-68F8AE9F1CF6]
    // </editor-fold> 
    private ArrayList<Equipo> Equipos;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E37E7AB9-4189-D7D7-8A35-E928BC5C79EC]
    // </editor-fold> 
    public Partido () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3BD011FB-CED9-DD8F-A8E1-FFB33089CB90]
    // </editor-fold> 
    public ArrayList<Equipo> getEquipos () {
        return Equipos;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B4231FF5-F9B2-8476-B4C7-46259064D880]
    // </editor-fold> 
    public void setEquipos (ArrayList<Equipo> val) {
        this.Equipos = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DFF888B9-0D3F-58CA-1326-5077BF763586]
    // </editor-fold> 
    public ArrayList<Cambio> getCambios () {
        return Cambios;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1E7EACF3-BE8A-1D78-8E5C-98874EBF7453]
    // </editor-fold> 
    public void setCambios (ArrayList<Cambio> val) {
        this.Cambios = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.779AED02-3EF2-0CD7-15E3-91C659D18EC4]
    // </editor-fold> 
    public Date getFecha () {
        return Fecha;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1E6B5250-177E-2AE0-85DE-DBF465BCDD69]
    // </editor-fold> 
    public void setFecha (Date val) {
        this.Fecha = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8D81C1A6-8DA4-D496-7903-058B9334A8F7]
    // </editor-fold> 
    public int getMinutosJugados () {
        return minutosJugados;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.65E8B52A-6025-D30D-CF3C-7AFB0B0B441B]
    // </editor-fold> 
    public void setMinutosJugados (int val) {
        this.minutosJugados = val;
    }

}

