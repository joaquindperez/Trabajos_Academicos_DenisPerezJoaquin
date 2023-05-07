package Ejercitacion;

public class Imprimir_Do_While {

    public static void main(String[] args) {
        //CICLO WHILE: ejecuta un bloque de código mientras una condición sea cierta L condición se comprueba al inicio del bucle
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
        i = 20;
        do {
            i++;
            System.out.println(i);
        } while (i < 30);

        for (i = 40; i <= 50; i++) {
            i++;
            System.out.println(i);
        }
    }
}
