package modelo;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.3E2CDAC7-EAA0-731E-D3D0-68FD83531BB2]
// </editor-fold> 
public class Volante extends Jugador  implements java.io.Serializable{

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.89DE8328-942B-4F22-9FE8-1E09ED1DB55E]
    // </editor-fold> 
    private Equipo Equipo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ECAB77D1-4617-C5D1-0E57-82EA4B47A6FD]
    // </editor-fold> 
    public Volante () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5553BEE6-716A-D7BB-BEBC-6D07DDC0E713]
    // </editor-fold> 
    public void Asistir () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BF875D95-A558-5F88-D635-F59D4270A825]
    // </editor-fold> 
    public Equipo getEquipo () {
        return Equipo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8321B428-47AF-1156-D28E-C32F187B6A93]
    // </editor-fold> 
    public void setEquipo (Equipo val) {
        this.Equipo = val;
    }

}

