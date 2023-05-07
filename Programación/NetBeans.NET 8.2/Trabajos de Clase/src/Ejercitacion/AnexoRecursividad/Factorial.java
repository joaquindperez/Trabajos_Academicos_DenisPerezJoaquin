package Ejercitacion.AnexoRecursividad;

public class Factorial {

    public static int Factorial(int Numero) {
        if (Numero == 0) {
            return 1;
        } else {
            return Numero * Factorial(Numero - 1);
        }
    }

    public static void main(String[] args) {
        int Numero = 4;
        int Resultado;
        Resultado = Factorial(Numero);
        System.out.println(Resultado);

    }
}
