//Crear una clase con los siguientes atributos: Nombre, Apellido, Email, Telefono
//Crear un constructor que acepte como parámetros todos los atributos de la clase
package Ejercitacion.Constructor;

public class Ej2_ObtenerAtributos {

    public String Nombre;
    public String Apellido;
    public String Telefono;
    public String Email;

    public String ObtenerAtributos() {
        return "Nombre: " + Nombre + "\n" + "Apellido: " + Apellido + "\n" + "Telefono: " + Telefono + "\n" + "Email: " + Email;
    }

    public static void main(String[] arg) {
        Ej2_ObtenerAtributos oTexto = new Ej2_ObtenerAtributos();
        oTexto.Nombre = "Joaquin";
        oTexto.Apellido = "Perez";
        oTexto.Email = "joaquinp@gmail.com";
        oTexto.Telefono = "12345678";
        System.out.println(oTexto.ObtenerAtributos());

    }
}
