package modelo;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.554CDDB7-129A-58BA-FCE2-DD0E8272D222]
// </editor-fold> 
public class Cambio  implements java.io.Serializable{
static final long serialVersionUID = 42L;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ED12E726-D44C-1FFC-5FE7-F616524B1A16]
    // </editor-fold> 
    private int FechaHora;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EFC062B2-DDC5-DF25-2712-D70F8E360CEF]
    // </editor-fold> 
    private Jugador JugadorRetirado;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.36F44D55-D4DC-4901-3807-89CAC894C689]
    // </editor-fold> 
    private Jugador JugadorEntrante;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1D901758-A44B-2DFA-C9EB-06F377C74008]
    // </editor-fold> 
    public Cambio () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.43853472-8D10-C043-7674-6A34E6D60BC4]
    // </editor-fold> 
    public int getFechaHora () {
        return FechaHora;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.90B13227-C2FD-CF52-C6B6-7B73F9B9BDFD]
    // </editor-fold> 
    public void setFechaHora (int val) {
        this.FechaHora = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4ABB7D37-FD2B-6CD9-E12F-288AC84A4DA1]
    // </editor-fold> 
    public Jugador getJugadorEntrante () {
        return JugadorEntrante;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4E5BB38B-A351-15F5-47D0-A0B3494C64A8]
    // </editor-fold> 
    public void setJugadorEntrante (Jugador val) {
        this.JugadorEntrante = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A843E6F8-B3F9-E1B2-3AB7-FE1451224A34]
    // </editor-fold> 
    public Jugador getJugadorRetirado () {
        return JugadorRetirado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.61888AB5-D57C-2BB6-5855-92FEA5368A31]
    // </editor-fold> 
    public void setJugadorRetirado (Jugador val) {
        this.JugadorRetirado = val;
    }

}

