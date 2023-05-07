//Crear un pograma con la clase Persona, con la siguiente estructura:
//Id, entero
//Apellido, texto
//Nombre, texto
//FechaNacimiento, fecha
//EstadoCuenta, decimal
//Id
//Apellido
//Nombre
//Edad
//EstadoCuenta
//Crear el método ToString() public para mostrar el contenido completo del objeto.
//Crear un contador estático de objetos.
//Crear el método Ingreso(Importe decimal), el mismo debe incrementar el estado de cuenta con el valor ingresado con parámetro.

package Ejercitacion.Herencia;

public class Ej5_Persona {
    private static int cantidadDePersonas = 0;
    private int id;
    private String apellido;
    private String nombre;
    private double estadoCuenta;

    public Ej5_Persona(int id, String apellido, String nombre, double estadoCuenta) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.estadoCuenta = estadoCuenta;
        cantidadDePersonas++;
    }

    @Override
    public String toString() {
        return "Ejercicio7Persona{" + "id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", estadoCuenta=" + estadoCuenta + '}';
    }

    public static int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public static void setCantidadDePersonas(int cantidadDePersonas) {
        Ej5_Persona.cantidadDePersonas = cantidadDePersonas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(double estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }
    
    public void añadirImporte(double importe) {
    estadoCuenta+=importe;    
    }
}
