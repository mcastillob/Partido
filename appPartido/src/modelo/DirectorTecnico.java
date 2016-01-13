package modelo;
import java.util.ArrayList; 


public class DirectorTecnico  implements  java.io.Serializable{
static final long serialVersionUID = 42L;
    
    private String rut;

    
    private String nombre;

    
    private String apellidoPat;

   
    private String apellidoMat;

    
    private ArrayList<Campeonato> Titulos;

    
    public DirectorTecnico () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.86467CBE-75DB-0A02-80F3-A201A5949F8A]
    // </editor-fold> 
    public ArrayList<Campeonato> getTitulos () {
        return Titulos;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B8DF8FBF-5A0B-ACBB-19CD-56509421C52C]
    // </editor-fold> 
    public void setTitulos (ArrayList<Campeonato> val) {
        this.Titulos = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.622774CB-EB44-ECC2-4315-86A289534C64]
    // </editor-fold> 
    public String getApellidoMat () {
        return apellidoMat;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7E0B57CF-B9B6-2ED2-E81A-E04E8E48B351]
    // </editor-fold> 
    public void setApellidoMat (String val) {
        this.apellidoMat = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B5287820-A799-B2CF-E1E4-DD04C68F42B8]
    // </editor-fold> 
    public String getApellidoPat () {
        return apellidoPat;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AAD5964A-379D-4F3F-F260-4292D5458C5C]
    // </editor-fold> 
    public void setApellidoPat (String val) {
        this.apellidoPat = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2A364F8A-D987-D702-7AD4-FA9B1EA29DC0]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.46FCFCA9-B06E-FC84-4073-95D29DF939B6]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.19389B60-146C-E194-ED7B-1FFBBB2C9CF4]
    // </editor-fold> 
    public String getRut () {
        return rut;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.071D7A57-A950-90CD-0ED7-15076519AFDB]
    // </editor-fold> 
    public void setRut (String val) {
        this.rut = val;
    }

}

