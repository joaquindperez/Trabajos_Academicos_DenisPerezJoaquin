package Ejercitacion;

import java.util.Scanner;

public class Mostrar_Numero_Menor {

    public static int CalcularMenor(int num1, int num2, int num3) {
        int m;

        if (num1 < num2 && num1 < num3) {
            m = num1;
        } else {
            if (num2 < num3) {
                m = num2;
            } else {
                m = num3;
            }
        }
        return m;
    }

    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer valor: ");
        int v1 = teclado.nextInt();
        System.out.println("Ingrese segundo valor: ");
        int v2 = teclado.nextInt();
        System.out.println("Ingrese tercer valor: ");
        int v3 = teclado.nextInt();
        int menor;
        menor = CalcularMenor(v1, v2, v3);
        System.out.println("El valor menor es: " + menor);
    }
}
