//Crear un programa con la siguiente estructura.
//Clases Electrodomestico, Televisor y Radio.
//Electrodomestico es abstracta y padre de Televisor y Radio.
//Crear al menos 4 propiedades para cada clase.
//Crear los métodos encender, apagar y sincronizar.
//Cada método debe mostrar un mensaje por pantalla que se ejecutó correctamente.
//Crear un contador de objetos para cada clase
//Crear un menú para: cargar objetos Televisor y Radio en un arreglo de Electrodomésticos.
//Ejecutar los métodos encender, apagar y sincronizar.

package Ejercitacion.Herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej4_Main {
  static Scanner sc = new Scanner (System.in);
    static ArrayList<Ej4_Electrodomestico> electrodomesticos = new ArrayList<Ej4_Electrodomestico>();
   public static void main (String[]arg) {
       int Respuesta;
       String cadena = "Presione 1 para cargar un nuevo eletrodoméstico y presione 2 para salir";
       do {
          Respuesta = getRespuesta1o2(cadena);
          if (Respuesta==1) {
              electrodomesticos.add(crearElectrodomesticos());

          }else {
              System.out.println("Saliendo...");
          }
       }while (Respuesta==1);
       
       mostrarElectrodomesticos();
       
   }
   private static int getRespuesta1o2(String mensaje) {
       int Respuesta;
       do {
           System.out.println(mensaje);
           Respuesta = sc.nextInt();
       }while (Respuesta!=1 && Respuesta !=2);
       return Respuesta;
   }
   private static Ej4_Electrodomestico crearElectrodomesticos() {
       int Respuesta;
       Ej4_Electrodomestico electro = null;
       Respuesta = getRespuesta1o2("Presione 1 para Radio, 2 para Televisor: ");
       
       System.out.println("Precio en USD: ");
       double precioEnUSD=sc.nextDouble();
       System.out.println("Consumo en watts: ");
       double consumoenWatts = sc.nextDouble();
       System.out.println("Peso en KG: ");
       double pesoEnKg = sc.nextDouble();
       switch (Respuesta) {
           case 1:
               System.out.println("Alcance en mts: ");
               int alcanceEnMts = sc.nextInt();
               System.out.println("Duración batería en hs: ");
               double duracionBateriaEnHs = sc.nextDouble();
               electro = new Ej4_Radio(alcanceEnMts,duracionBateriaEnHs, precioEnUSD, consumoenWatts, pesoEnKg);
               break;
           case 2:
               System.out.print("Cantidad de canales: ");
               int cantidadDeCanales= sc.nextInt();
               int resolucion = sc.nextInt();
               electro = new Ej4_Televisor(cantidadDeCanales, resolucion, precioEnUSD, consumoenWatts, pesoEnKg);
               break;
               
       }
       return electro;
   }    
   private static void mostrarElectrodomesticos() {
       System.out.println("Hay " + Ej4_Electrodomestico.getCantidadElectrodomesticos()+" electrodoméstico en total");
       System.out.println("Hay "+ Ej4_Televisor.getContadorDeTelevision() + " televisores");
       System.out.println("Hay "+ Ej4_Radio.getContadorDeRadios()+ " radios\n");
       
       for (Ej4_Electrodomestico electrodomestico: electrodomesticos) {
           electrodomestico.encender();
           electrodomestico.sintonizar();
           electrodomestico.apagar();
           System.out.println(electrodomestico.toString());
           System.out.println("");
       }
   }  
}
