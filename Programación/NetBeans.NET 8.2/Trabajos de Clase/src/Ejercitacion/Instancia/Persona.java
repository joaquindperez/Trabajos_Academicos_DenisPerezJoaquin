package Ejercitacion.Instancia;

public class Persona {

    protected String primerNombre;
    protected String segundoNombre;
    protected String apellido;
    protected String documento;

    public Persona(String p, String s, String a, String d) {
        this.primerNombre = p;
        this.segundoNombre = s;
        this.apellido = a;
        this.documento = d;

    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

}
