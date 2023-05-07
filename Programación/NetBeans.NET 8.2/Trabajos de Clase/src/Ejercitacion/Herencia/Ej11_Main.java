package Ejercitacion.Herencia;

public class Ej11_Main {

    public static void main(String[] args) {
        Ej11_Zonas objZona = new Ej11_Zonas("Joaquin", "Perez", 21, 5, 45000);
        objZona.VerDatosZonas();
        objZona.toString();
        System.out.println(objZona);
        Ej11_Puesto objPuesto = new Ej11_Puesto("Raul", "Sanchez", 30, 25, 60000, "Gerente");
        objPuesto.VerDatosPuesto();
        objPuesto.toString();
        System.out.println(objPuesto);
    }
}
