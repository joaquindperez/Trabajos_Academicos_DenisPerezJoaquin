package Ejercitacion.Herencia;

public class Ej9_Usar_Constructores {

    public static void main(String[] args) {
        //EL LENGUAJE SABE DE FORMA INDIRECTA QUE CONSTRUCTOR UTILIZAR
        Ej9_Cliente objcliente = new Ej9_Cliente();
        Ej9_Cliente objcliente2 = new Ej9_Cliente("Sosa", "Esteban", "SosaEsteban@mail.com", "12345678");

        //SOLO SE PUEDE ACCEDER A LOS ATRIBUTOS A TRAVÉS DE SUS PROPIEDADES 
        //MOSTRAR EL NOMBRE DEL CLIENTE
        System.out.println(objcliente2.getNombre());
        System.out.println(objcliente2.getApellido());
        //CAMBIAR EL NOMBRE DEL CLIENTE
        objcliente2.setNombre("Mauro");
        System.out.println(objcliente2.getNombre());

    }
}
