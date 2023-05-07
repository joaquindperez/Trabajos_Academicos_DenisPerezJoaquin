
package Ejercitacion.Herencia;

import java.util.Scanner;

public class Ej2Operacion {
    protected Scanner teclado;
protected int valor1;
protected int valor2;
protected int resultado;

public Ej2Operacion() {
teclado=new Scanner(System.in);
}
public void cargar1() {
System.out.print("Ingrese el primer valor:");
valor1=teclado.nextInt();
}
public void cargar2() {
System.out.print("Ingrese el segundo valor:");
valor2=teclado.nextInt();
}
public void mostrarResultado() {
System.out.println(resultado);
}
}
