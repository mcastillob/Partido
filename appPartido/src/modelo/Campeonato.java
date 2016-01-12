package modelo;
import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.1075DB58-FCB7-F562-D605-7966881850A6]
// </editor-fold> 
public class Campeonato   implements java.io.Serializable{
static final long serialVersionUID = 42L;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E8EA2335-07F8-486E-0C6F-D2892E77F37F]
    // </editor-fold> 
    private ArrayList<Partido> Partidos;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F9A3C3A3-2CE1-0931-49F4-638D9FD20550]
    // </editor-fold> 
    public Campeonato () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3D573EB5-CEC1-E2D8-DBD8-4CE205A95CA0]
    // </editor-fold> 
    public ArrayList<Partido> getPartidos () {
        return Partidos;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9744596E-DC7B-B628-A7FD-F62FDE603D76]
    // </editor-fold> 
    public void setPartidos (ArrayList<Partido> val) {
        this.Partidos = val;
    }

}

