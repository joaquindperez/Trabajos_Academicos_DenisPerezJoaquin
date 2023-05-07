
package Ejercitacion.RegEx;

public class Split {
   public static void main (String[]arg) {
    String str = "blanco-rojo:amarillo.verde_azul";
    String[] cadenas = str.split("[-:._]");
    for (int i = 0; i< cadenas.length; i++) {
        System.out.println(cadenas[i]);
    }
    }     
}
