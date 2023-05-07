package Ejercitacion;

import java.util.Scanner;

public class Suma_Producto_Diferencia_Division {

    static int num1, num2, suma, diferencia, producto, division;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese segundo número: ");
        num2 = teclado.nextInt();

        suma = num1 + num2;
        diferencia = (num1 + num2) / 2;
        producto = num1 * num2;
        division = num1 / num2;

        if (num1 > num2) {
            System.out.println("La suma de los números es: " + suma + " y su diferencia es: " + diferencia);
        }
        if (num1 < num2) {
            System.out.println("El producto de los números es: " + producto + " y su division es: " + division);
        }
    }
}
