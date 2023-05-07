
package Ejercitacion.RegEx;

public class Split_Ejemplo {
    public static void main (String[]arg) {
    String str = "esto es un ejemplo de como funciona split";
    String[] cadenas = str.split("(e[s|m])|(pl)");
    for (int i = 0; i< cadenas.length; i++) {
        System.out.println(cadenas[i]);
    }
    }     
}
