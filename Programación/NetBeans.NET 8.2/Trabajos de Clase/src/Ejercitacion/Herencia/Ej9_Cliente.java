
package Ejercitacion.Herencia;

public class Ej9_Cliente {
     //ATRIBUTOS PRIVADOS
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Telefono;

    //CREAR UN CONSTRUCTOR PARA INCIALIZAR EL OBJETO CON VALORES EN BLANCO
    //EL CONSTRUCTOR UTILIZA EL MISMO NOMBRE QUE LA CLASE Y SU ACCESO ES PUBLICO
    public Ej9_Cliente() {
        this.Nombre="";
        this.Apellido="";
        this.Email="";
        this.Telefono="";
    }
    //CREAR UN CONSTRUCTOR PARA INICIALIZAR EL OBJETO CON VALORES ENVIADOS POR PARÁMETRO
    //AL CREAR UN MÉTODO CON EL MISMO NOMBRE, PERO CON DISTITNOS PARÁMETROS, ESTAMOS SOBRECARGANDO EL METODO CONSTRUCTOR
    public Ej9_Cliente(String pNombre, String pApellido, String pEmail, String pTelefono){
        this.Nombre=pNombre;
        this.Apellido=pApellido;
        this.Email=pEmail;
        this.Telefono=pTelefono;
    }
    //CREAR MÉTODO SET Y GET PARA CADA ATRIBUTO. 
    //SE UTILIZAN PARA ESTABLECER Y OBTENER VALORES EN LOS ATRIBUTOS PRIVADOS
    public String getNombre() {
        return this.Nombre;
    }
    public void setNombre(String pNombre) {
        this.Nombre=pNombre;
    }
    public String getApellido() {
        return this.Apellido;
    }
    public void setApellido(String pApellido) {
        this.Apellido=pApellido;
    }
    public String getEmail() {
        return this.Email;
    }
    public void setEmail(String pEmail) {
        this.Email=pEmail;
    }
    public String getTelefono() {
        return this.Telefono;
    }
    public void setTelefono(String pTelefono) {
        this.Telefono=pTelefono;
    }
}
