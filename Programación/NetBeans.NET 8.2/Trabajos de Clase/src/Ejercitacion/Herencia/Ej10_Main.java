package Ejercitacion.Herencia;

public class Ej10_Main {

    public static void main(String[] args) {
        //CADA CLASE HIJA TIENE SUS ATRIBUTOS Y LOS ATRIBUTOS DE SU CLASE PADRE
        Ej10_Clase_Hija_Proveedor_Mayorista objPMayor = new Ej10_Clase_Hija_Proveedor_Mayorista();
        objPMayor.EmpresaTransporte = "Los Viajantes S.A.";//CREADO EN LA CLASE PROVEEDORMAYORISTA
        objPMayor.Rubro = "Tecnología";//CREADO EN LA CLASE PROVEEDOR
        objPMayor.Apellido = "Ressi";//CREADO EN LA CLASE PERSONA
        objPMayor.Nombre = "Estela";//CREADO EN LA CLASE PERSONA
        objPMayor.Telefono = "455678";//CREADO EN LA CLASE PERSONA
        objPMayor.Email = "joa@gmil.com";//CREADO EN LA CLASE PERSONA
        System.out.println("Nombre: " + objPMayor.Nombre + " Apellido: " + objPMayor.Apellido + " Email: " + objPMayor.Email
                + " Rubro: " + objPMayor.Rubro + " Empresa de Transporte: " + objPMayor.EmpresaTransporte + " Telefono: " + objPMayor.Telefono);

    }
}
