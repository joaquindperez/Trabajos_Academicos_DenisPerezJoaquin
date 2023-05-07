package Ejercitacion;

import java.util.Scanner;

public class Numero_Nulo_Positivo_Negativo {

    static int num1;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número entero: ");
        num1 = teclado.nextInt();

        if (num1 < 0) {
            System.out.println("ES NEGATIVO");
        }
        if (num1 == 0) {
            System.out.println("ES NULO");
        }
        if (num1 > 0) {
            System.out.println("ES POSITIVO");
        }

    }
}
