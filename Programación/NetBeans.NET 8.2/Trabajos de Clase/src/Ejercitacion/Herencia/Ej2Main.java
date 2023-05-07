/*Supongamos que necesitamos implementar dos clases que llamaremos Suma y Resta.
Cada clase tiene como atributo valor1, valor2 y resultado. Los métodos a definir son
cargar1 (que inicializa el atributo valor1), carga2 (que inicializa el atributo valor2),
operar (que en el caso de la clase &quot;Suma&quot; suma los dos atributos y en el caso de la
clase &quot;Resta&quot; hace la diferencia entre valor1 y valor2, y otro método
mostrarResultado. Solamente el método operar es distinto para las clases Suma y
Resta (esto hace que no lo podamos disponer en la clase Operacion), luego los
métodos cargar1, cargar2 y mostrarResultado son idénticos a las dos clases, esto hace
que podamos disponerlos en la clase Operacion. Lo mismo los atributos valor1, valor2
y resultado se definirán en la clase padre Operacion. Crear un proyecto y luego crear
cuatro clases llamadas: Operacion, Suma, Resta y Prueba.*/

package Ejercitacion.Herencia;

public class Ej2Main {
    public static void main(String[]args) {
        Ej2Suma suma1=new Ej2Suma();
        suma1.cargar1();
        suma1.cargar2();
        suma1.operar();
        System.out.print("El resultado de la suma es:");
        suma1.mostrarResultado();
        Ej2Resta resta1=new Ej2Resta();
        resta1.cargar1();
        resta1.cargar2();
        resta1.operar();
        System.out.print("El resultado de la resta es:");
        resta1.mostrarResultado();
    }
}
