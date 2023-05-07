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

public class Ej4_Televisor extends Ej4_Electrodomestico{
     private static int contadorDeTelevisores;
    private int cantidadDeCanales;
    private int resolucion;

    public Ej4_Televisor(int cantidadDeCanales, int resolucion, double precioEnUSD, double consumoEnWatts, double pesoEnKg) {
        super(precioEnUSD, consumoEnWatts, pesoEnKg);
        this.cantidadDeCanales = cantidadDeCanales;
        this.resolucion = resolucion;
        contadorDeTelevisores++;
    }
    @Override
    public void encender() {
        System.out.println("Encendiendo la televisión");
    }
    @Override
    public void apagar(){
    System.out.println("Apagando la televisión");
}
    @Override
    public void sintonizar() {
        System.out.println("Sintonizando la televisión");
    }
    public static int getContadorDeTelevision() {
        return contadorDeTelevisores;
    }

    @Override
    public String toString() {
        return "Ejercicio6Televisor{" + "cantidadDeCanales=" + cantidadDeCanales + ", resolucion=" + resolucion + '}';
    }
    
}
