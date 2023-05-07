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

public abstract class Ej4_Electrodomestico {
    public double precioEnUSD;
    public double consumoEnWatts;
    public double pesoEnKg;
    
    private static int cantidadDeElectrodomesticos;

    public Ej4_Electrodomestico(double precioEnUSD, double consumoEnWatts, double pesoEnKg) {
        cantidadDeElectrodomesticos++;
        this.precioEnUSD = precioEnUSD;
        this.consumoEnWatts = consumoEnWatts;
        this.pesoEnKg = pesoEnKg;
    }
        public abstract void encender();
        public abstract void apagar();
        public abstract void sintonizar();
        
        public static int getCantidadElectrodomesticos() {
            return cantidadDeElectrodomesticos;
        }

    @Override
    public String toString() {
        return "Ejercicio6Electrodom\u00e9stico{" + "precioEnUSD=" + precioEnUSD + ", consumoEnWatts=" + consumoEnWatts + ", pesoEnKg=" + pesoEnKg + '}';
    }
}
