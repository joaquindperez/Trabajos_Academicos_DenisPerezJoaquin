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

public class Ej4_Radio extends Ej4_Electrodomestico{
    private static int contadorDeRadios;
    private int alcanceAntenaEnMTS;
    private double duracionBateriaEnHs;

    public Ej4_Radio(int alcanceAntenaEnMTS, double duracionBateriaEnHs, double precioEnUSD, double consumoEnWatts, double pesoEnKg) {
        super(precioEnUSD, consumoEnWatts, pesoEnKg);
        this.alcanceAntenaEnMTS = alcanceAntenaEnMTS;
        this.duracionBateriaEnHs = duracionBateriaEnHs;
        contadorDeRadios++;
    }
    @Override
    public void encender() {
        System.out.println("Encendiendo la radio");
    }
    @Override
    public void apagar(){
    System.out.println("Apagando la radio");
}
    @Override
    public void sintonizar() {
        System.out.println("Sintonizando la radio");
    }

    public static int getContadorDeRadios() {
        return contadorDeRadios;
    }

    @Override
    public String toString() {
        return "Ejercicio6Radio{" + "alcanceAntenaEnMTS=" + alcanceAntenaEnMTS + ", duracionBateriaEnHs=" + duracionBateriaEnHs + '}';
    }
    
}
