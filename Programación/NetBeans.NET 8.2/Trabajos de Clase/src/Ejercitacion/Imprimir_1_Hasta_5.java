package Ejercitacion;

public class Imprimir_1_Hasta_5 {

    public static void imprimir(int Numero) {
        if (Numero > 0) {
            System.out.println(Numero);
            imprimir(Numero - 1);
        }
    }

    public static void main(String[] ar) {
        imprimir(5);
    }
}
