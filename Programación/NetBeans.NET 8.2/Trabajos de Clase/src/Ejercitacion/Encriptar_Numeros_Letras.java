
package Ejercitacion;

import java.util.Scanner;

public class Encriptar_Numeros_Letras {
     static String clave;
    public String encriptar() {
        String auxString1 = clave.replace('e','3');
        String auxString2 = auxString1.replace('i','1');
        String auxString3 = auxString2.replace('o','0');
        return auxString3;
    }
        public String desencriptar() {
        String auxString1 = clave.replace('3','e');
        String auxString2 = auxString1.replace('1','i');
        String auxString3 = auxString2.replace('0','o');
        return auxString3;
    }
public static void main (String[]arg){
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingrese una clave: ");
    clave = sc.nextLine();
    Encriptar_Numeros_Letras oEncriptar = new Encriptar_Numeros_Letras();
    Encriptar_Numeros_Letras oDesencriptar = new Encriptar_Numeros_Letras();
    System.out.println("La clave encriptada es: "+oEncriptar.encriptar());
    System.out.println("La desencriptada es: "+oDesencriptar.desencriptar());
}    
}
