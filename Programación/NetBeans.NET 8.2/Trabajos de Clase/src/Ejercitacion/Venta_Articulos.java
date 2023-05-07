package Ejercitacion;

import java.util.Scanner;

public class Venta_Articulos {

    static int precio, cantidad, total;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese precio del articulo: ");
        precio = teclado.nextInt();
        System.out.println("Ingrese la cantidad a enviar: ");
        cantidad = teclado.nextInt();

        total = precio * cantidad;
        System.out.println("El comprador debe abonar: " + total);
    }
}
