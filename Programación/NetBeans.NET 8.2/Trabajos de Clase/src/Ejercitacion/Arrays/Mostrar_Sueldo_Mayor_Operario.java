package Ejercitacion.Arrays;

import java.util.Scanner;

public class Mostrar_Sueldo_Mayor_Operario {

    private static String[] nombres = new String[5];
    private static float[] sueldos = new float[5];

    public static void cargar() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese nombre: ");
            nombres[i] = teclado.next();
            System.out.println("Ingrese sueldo: ");
            sueldos[i] = teclado.nextFloat();

        }
    }

    public static void mayorsueldo() {
        /*float mayor;*/
        int j;
        float mayor = sueldos[0];
        int pos;
        pos = 0;
        for (j = 1; j < sueldos.length; j++) {
            if (sueldos[j] > mayor) {
                mayor = sueldos[j];
                pos = j;
            }
        }
        System.out.println("El empleado con " + " sueldo mayor es " + nombres[pos]);
        System.out.println("Tiene " + " un sueldo: " + mayor);
    }

    public static void main(String[] ar) {
        cargar();
        mayorsueldo();
    }
}
