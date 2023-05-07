package Ejercitacion.Arrays;

import java.util.Scanner;

public class Calcular_Numero_Menor_Vector {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int[] Vector = new int[4];
        for (int i = 0; i <= Vector.length - 1; i++) {
            System.out.println("Ingresa numero");
            int numero = Teclado.nextInt();
            Vector[i] = numero;

        }
        int min = Valorminimo(Vector);
        System.out.println("El numero mas chico es: " + min);
    }

    public static int Valorminimo(int[] Vector1) {
        int min = Vector1[0];
        for (int i = 0; i <= Vector1.length - 1; i++) {
            if (Vector1[i] < min) {
                min = Vector1[i];
            }
        }
        return min;
    }
}
