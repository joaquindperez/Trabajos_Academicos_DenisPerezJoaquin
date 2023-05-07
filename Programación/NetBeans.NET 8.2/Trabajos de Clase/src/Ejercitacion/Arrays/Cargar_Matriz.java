package Ejercitacion.Arrays;

import java.util.Scanner;

public class Cargar_Matriz {

    private static int[][] mat = new int[3][5]; //declarar matriz

    public static void CargarMatriz() {
        Scanner teclado = new Scanner(System.in);
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("Ingrese " + "componente: ");
                mat[f][c] = teclado.nextInt();
            }
        }
    }

    public static void Mostrar() {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(mat[f][c] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] ar) {
        CargarMatriz();
        Mostrar();
    }
}
