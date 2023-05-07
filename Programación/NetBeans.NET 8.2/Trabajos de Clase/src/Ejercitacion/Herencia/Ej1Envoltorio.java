package Ejercitacion.Herencia;

public class Ej1Envoltorio {

    private double decimal;

    public Ej1Envoltorio(double decimal) {
        this.decimal = decimal;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public static void main(String[] arg) {
        Ej1Envoltorio decimal = new Ej1Envoltorio(40.75);
        System.out.println("El valor contenido decimal es: " + decimal.getDecimal());

    }
}
