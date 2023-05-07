package Ejercitacion;

import java.util.Scanner;

public class Mostrar_Numero_Mayor {

    static int num1, num2, num3;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE NÚMEROS DISTINTOS");
        System.out.println("Ingrese primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese segundo número: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese tercer número: ");
        num3 = teclado.nextInt();
        System.out.println("El mayor es: ");

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

    }
}
