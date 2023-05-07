package Ejercitacion;

import java.util.Scanner;

public class Resultado_Promedio_Notas {

    static int num1, num2, num3, promedio, resultado;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese pimera nota: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese segunda nota: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese tercera nota: ");
        num3 = teclado.nextInt();

        promedio = (num1 + num2 + num3) / 3;
        if (promedio >= 7) {
            System.out.println("PROMOCIONADO con el promedio de: " + promedio);
        } else {
            System.out.println("REPROBADO con el promedio de: " + promedio);
        }

    }
}
