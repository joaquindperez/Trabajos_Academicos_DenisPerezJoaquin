
package Ejercitacion.Herencia;

public class Ej5_Main {
    public static void main(String[]arg) {
     Ej5_Persona persona = new Ej5_Persona(1, "Perez", "Joaquin", 20000);
     persona.añadirImporte(40000);
     System.out.println(persona.toString());
     System.out.println("Personas creadas: "+ " "+Ej5_Persona.getCantidadDePersonas());
 }   
}
