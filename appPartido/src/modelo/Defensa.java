package modelo;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.ECAD3C3A-E0BF-74EB-C705-701539CE6A8C]
// </editor-fold> 
public class Defensa extends Jugador  implements java.io.Serializable{

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4B082C6E-496A-F300-5A75-EB3CFEB9A6F3]
    // </editor-fold> 
    private Equipo Equipo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.94075C9E-6E70-5312-9D10-6B1DCF93DDB7]
    // </editor-fold> 
    public Defensa () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5C38B278-1CE8-7EFC-8BBE-5C08B14894CF]
    // </editor-fold> 
    public void Defender () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.356B3F88-6817-4DFF-0FAE-BF9F10B679EB]
    // </editor-fold> 
    public Equipo getEquipo () {
        return Equipo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3F9F694C-2547-8C91-959D-666B7D9535BB]
    // </editor-fold> 
    public void setEquipo (Equipo val) {
        this.Equipo = val;
    }

}

