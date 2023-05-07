package Ejercitacion.Herencia;

public class Ej3_Usuario {

    private String nombre;
    private int dinero;

    public Ej3_Usuario(String nom) {
        nombre = nom;
        dinero = 0;
    }

    public int retornarMonto() {
        return dinero;
    }

    public void depositar(int m) {
        dinero = dinero + m;
    }

    public void extraer(int m) {
        dinero = dinero - m;
    }

    public void imprimir() {
        System.out.println(nombre + " Tiene depositado la suma de: " + dinero);
    }
}
