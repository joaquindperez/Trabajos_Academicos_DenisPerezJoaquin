package Ejercitacion.AnexoRecursividad;

import java.util.Scanner;

public class Cantidad_Digitos {

    public static int CantidadDigitos(int n) {
        int resultado;
        if (n < 10 && n > -10) {
            resultado = 1;
        } else {
            resultado = CantidadDigitos(n / 10) + 1;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();
        int CantidadDigitos = CantidadDigitos(numero);
        System.out.print("El número: " + numero + " tiene " + CantidadDigitos + " digito");
        if (CantidadDigitos > 1) {
            System.out.print("s");
        }
    }
}
