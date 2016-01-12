package modelo;
import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.3793631C-D346-6C18-9478-2B033D51DEAA]
// </editor-fold> 
public class Jugador  implements java.io.Serializable{

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.088C524C-5A1F-8CAA-D6B9-9FD9A64C3B90]
    // </editor-fold> 
    private String Rut;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D72E3ACD-E66C-62E2-4DD3-4E61D567A73D]
    // </editor-fold> 
    private int tiroLibres;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.140C11E6-6E03-71B4-F08C-5AE5BC0C1009]
    // </editor-fold> 
    private int penales;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F1158AC4-0177-1F35-5DD7-5C6DB5222922]
    // </editor-fold> 
    private int penalesConvertidos;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4B5F6C03-DFAC-504D-1EDE-91FA3A33FD61]
    // </editor-fold> 
    private int penalesAtajados;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FF77F01C-A337-7176-1BDC-59878B2F8D3B]
    // </editor-fold> 
    private int numero;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.16199354-1B0B-EFF8-C3B5-03C6690EC0CF]
    // </editor-fold> 
    private boolean titular;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AE2DC881-8E25-EDE7-C57C-3898962CD4CD]
    // </editor-fold> 
    private int asistencias;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.98420487-EF0B-3698-1321-54F1894F4A86]
    // </editor-fold> 
    private int goles;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F644903A-1138-FD21-0D7F-0AFDA060AE73]
    // </editor-fold> 
    private Equipo Equipo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.723A7DB7-74EF-821B-8F3E-8829269057DC]
    // </editor-fold> 
    private Cambio mCambios;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CB8B2FCF-9C0D-693C-81C0-64BEA7D59AC7]
    // </editor-fold> 
    private ArrayList<Tarjeta> Tarjetas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0710659D-AFEB-BF72-BB1C-05B68BFA285F]
    // </editor-fold> 
    private String ApellidoPaterno;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7B93B398-F7C8-66B9-0295-16008D71C990]
    // </editor-fold> 
    private String ApellidoMaterno;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1B5B9156-1F06-5A65-18CA-230E90EE2981]
    // </editor-fold> 
    private int edad;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.54DD5F81-8218-FB05-AC8A-2636659F4074]
    // </editor-fold> 
    private String Nombres;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.33EA740B-080D-DB59-0F2C-6F586078151B]
    // </editor-fold> 
    public Jugador () {
    }
    public String getNombreCompleto(){
    String nomCompleto=Nombres+" "+ApellidoPaterno+" "+ApellidoMaterno;
    return nomCompleto;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.12F9BB0B-A987-9FF9-8751-27421BC2EA11]
    // </editor-fold> 
    public String getNombres () {
        return Nombres;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5CAB89C7-275C-5651-8C96-D79D43A23AFF]
    // </editor-fold> 
    public void setNombres (String val) {
        this.Nombres = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C0A57944-C2B4-FD7E-F0FB-0E524B193688]
    // </editor-fold> 
    public String getApellidoMaterno () {
        return ApellidoMaterno;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C8F95D86-6C1B-5FFD-B811-CEDCD79D0D9C]
    // </editor-fold> 
    public void setApellidoMaterno (String val) {
        this.ApellidoMaterno = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.98B6B6C7-8B61-CA34-DCF6-151C84285593]
    // </editor-fold> 
    public String getApellidoPaterno () {
        return ApellidoPaterno;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F3D7A61E-2853-3C7D-B6B1-A818468A57D1]
    // </editor-fold> 
    public void setApellidoPaterno (String val) {
        this.ApellidoPaterno = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.66531C29-C016-B47B-B432-CE99E3D1D116]
    // </editor-fold> 
    public int getEdad () {
        return edad;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A037519C-C32B-B295-55EE-48FD90C14A72]
    // </editor-fold> 
    public void setEdad (int val) {
        this.edad = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.39565990-2576-775E-D6F7-122E0FD35F9D]
    // </editor-fold> 
    public ArrayList<Tarjeta> getTarjetas () {
        return Tarjetas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.73FD86B7-8490-F70B-1709-7B2DB0ABB70D]
    // </editor-fold> 
    public void setTarjetas (ArrayList<Tarjeta> val) {
        this.Tarjetas = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.40657216-9B14-5797-5132-1F049B5954AC]
    // </editor-fold> 
    public Equipo getEquipo () {
        return Equipo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.82EAE633-BAA6-DCDE-B4C6-BC3B9E86CD12]
    // </editor-fold> 
    public void setEquipo (Equipo val) {
        this.Equipo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.88CE9B4C-0DFC-BFEC-82EE-3C954F889198]
    // </editor-fold> 
    public int getAsistencias () {
        return asistencias;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B343EC7C-34E0-BB40-6B11-150D35317700]
    // </editor-fold> 
    public void setAsistencias (int val) {
        this.asistencias = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.071009DE-645D-D9C5-AD7F-B7B3177F5C5D]
    // </editor-fold> 
    public int getGoles () {
        return goles;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9319439A-3854-745B-AC15-D700D640599C]
    // </editor-fold> 
    public void setGoles (int val) {
        this.goles = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F58BACF9-E898-9986-76A5-D58B6FC1E3D6]
    // </editor-fold> 
    public Cambio getCambios () {
        return mCambios;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.314302D3-BF9B-CE9D-39FF-7D149028D941]
    // </editor-fold> 
    public void setCambios (Cambio val) {
        this.mCambios = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.55B96227-9A8B-F298-4D00-BCEFAB72CA33]
    // </editor-fold> 
    public int getNumero () {
        return numero;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0AA511B5-056B-C08F-648C-F998A00C231A]
    // </editor-fold> 
    public void setNumero (int val) {
        this.numero = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7496DB76-70B6-7988-1134-D12D1B30FC1C]
    // </editor-fold> 
    public int getPenales () {
        return penales;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.349F0D18-A0D2-F84A-E53F-C19FDE920188]
    // </editor-fold> 
    public void setPenales (int val) {
        this.penales = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.58EF4A72-F6DC-F2C7-83A2-3251F6AD308A]
    // </editor-fold> 
    public int getPenalesAtajados () {
        return penalesAtajados;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D1E7BFBE-9F4C-04CA-9726-CDE510B9574A]
    // </editor-fold> 
    public void setPenalesAtajados (int val) {
        this.penalesAtajados = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.639A40E6-779F-2C9D-5776-0FC6E42E13F3]
    // </editor-fold> 
    public int getPenalesConvertidos () {
        return penalesConvertidos;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1187BAA3-7B09-4C68-CFA0-3AD5ADCC4E7A]
    // </editor-fold> 
    public void setPenalesConvertidos (int val) {
        this.penalesConvertidos = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B9B8B96D-8842-D7B6-6425-5E4BEF799619]
    // </editor-fold> 
    public int getTiroLibres () {
        return tiroLibres;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9ACD2B1F-658C-CB3F-C41D-1DD7350CF391]
    // </editor-fold> 
    public void setTiroLibres (int val) {
        this.tiroLibres = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6B273BE3-0A79-AB09-5489-0E50A9F8E7AD]
    // </editor-fold> 
    public boolean getTitular () {
        return titular;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BC814C46-14AB-77C4-8B18-0F9AA5BF87DD]
    // </editor-fold> 
    public void setTitular (boolean val) {
        this.titular = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C1226E69-F725-0E2A-716D-8B75C08036FA]
    // </editor-fold> 
    public String getRut () {
        return Rut;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CAAC6A6B-3E94-5534-989F-7F78E676F34C]
    // </editor-fold> 
    public void setRut (String val) {
        this.Rut = val;
    }

}

