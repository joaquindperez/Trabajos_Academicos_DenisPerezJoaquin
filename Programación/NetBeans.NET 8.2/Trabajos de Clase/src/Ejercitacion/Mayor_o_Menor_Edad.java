package Ejercitacion;

import java.util.Scanner;

public class Mayor_o_Menor_Edad {

    public static void CalculoEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Es mayor de 18 años");

        } else {
            System.out.println("Es menor de 18 años");
        }
    }

    public static void main(String[] ar) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese edad: ");
        edad = teclado.nextInt();
        System.out.println("Edad: " + edad);
        CalculoEdad(edad);
    }
}
