
package Ejercitacion;

public class Ejercitacion_Uso_This {
    String Nombre;
   String Apellido;
   String RazonSocial;
   
   public String ObtenerNombreCompleto()
   {
       return "Nombre: " + this.Nombre + ", Apellido: " + this.Apellido+", Razon Social: "+this.RazonSocial;
       //ES LO MISMO QUE ESCRIBIR
       //return"Nombre: "+ Nombre + ", Apellido: " + Apellido + ", Razon Social: " + RazonSocial; 
   }
   public static void main(String[]arg) {
       Ejercitacion_Uso_This oTexto = new Ejercitacion_Uso_This();
       oTexto.Apellido="Perez";
       oTexto.Nombre="Juan";
       oTexto.RazonSocial="30569888";
       System.out. println(oTexto.ObtenerNombreCompleto());
       
   }
}
