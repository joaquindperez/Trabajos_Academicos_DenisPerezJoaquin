
package Ejercitacion.Instancia;

public class Main {
    public static void main(String[]args) {
        Empleado empleado = new Empleado ("Ventas","0","GV50",32000,"Alejandro","Ignacio","Fursi","17.767.076");
        Gerente gerente = new Gerente ("Ventas","0","GV50",30000,"Daniel","Federico","Ruiz","34.654.890");
        Director director = new Director("Vocal","Ventas","0","GV50",25000,"Juan","Pedro","Goyena","17.678.543");
        
        if (empleado instanceof Empleado)
        System.out.println("Empleado es una instacia de Empleado");
        if (empleado instanceof Persona)
        System.out.println("Empleado es una instacia de Persona");
        if (gerente instanceof Empleado)
        System.out.println("Gerente es una instancia de Empleado");
        if (director instanceof Empleado)
        System.out.println("Director es una instancia de Empleado");
        if (director instanceof Persona)
        System.out.println("Diretor es una instancia de Persona");
    }
}
