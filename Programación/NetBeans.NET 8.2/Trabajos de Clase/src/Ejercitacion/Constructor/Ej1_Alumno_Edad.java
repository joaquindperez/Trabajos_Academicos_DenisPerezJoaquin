//Plantear una clase llamada Alumno y definir como atributos nombre y edad.
//En el constructor realizar la carga de datos.
//Definir otros dos métodos para imprimir los datos ingresados y un mensaje si es mayor o no de edad (edad >=18)

package Ejercitacion.Constructor;

public class Ej1_Alumno_Edad {
    public String Nombre;
    public int Edad;

    public Ej1_Alumno_Edad() {
        Nombre="Joaquin";
        Edad= 21;
    }
   
   public void MayorMenor() {
       String mayor_menor;
    if(Edad>=18) {
        mayor_menor="Es mayor de edad";
    }   
    else {
        mayor_menor="Es menor de edad";
    }
   }
   //metodo para generar datos
   public void Imprime() {
       System.out.println("Nombre: " + Nombre);
       System.out.println("Edad: " + Edad);
   }
   
    public static void main(String[]arg) {
        Ej1_Alumno_Edad oTexto = new Ej1_Alumno_Edad();
        oTexto.MayorMenor();
        oTexto.Imprime();
    }
}
