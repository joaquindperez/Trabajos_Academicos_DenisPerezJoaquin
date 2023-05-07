
package Ejercitacion;

public class Contenido_Correo {
    public static void main (String[]arg) {
     String email="joaquin@gmail.com";
        if (email.contains("@")) {
            System.out.println("El mail contiene el '@' ");
        }else {
            System.out.println("El mail no contiene el '@' ");
        }
    }
}
