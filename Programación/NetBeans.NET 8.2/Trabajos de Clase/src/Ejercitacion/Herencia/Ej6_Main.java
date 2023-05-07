
package Ejercitacion.Herencia;

public class Ej6_Main {
    public static void main(String[] args) {
        Ej6_Comercial objComercial = new Ej6_Comercial(300, "Joaquin", 21, 40000);
        objComercial.toString();
        objComercial.plus();
        Ej6_Repartidor objRepartidor = new Ej6_Repartidor("3", "Raul", 30, 50000);
        objRepartidor.toString();
        objRepartidor.plus();
        
        System.out.println(objComercial);
        System.out.println(objRepartidor);
    }
    
}
