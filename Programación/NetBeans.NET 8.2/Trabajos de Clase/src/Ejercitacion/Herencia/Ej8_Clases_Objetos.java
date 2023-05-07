//PROBAR LA CLASE EMPLEADO CREADA EN EL PUNTO ANTERIOR
package Ejercitacion.Herencia;

public class Ej8_Clases_Objetos {
      public static void main(String[] args) {
        //UNA VEZ DECLARA LA CLASE SE PUEDE UTILIZAR CREANDO UNA INSTANCIA DE ELLA (OBJETO)
        Ej8_Empleado objEmpleado = new Ej8_Empleado(); //NEW SE UTILIZA PARA CONSTRUIR EL OBJETO
        objEmpleado.Apellido="Perez"; //PARA UTILIZAR UN MIEMBRO ATRIBUTO DE LA CLASE
        objEmpleado.Nombre="Joaquin";
        objEmpleado.DNI=43238315;
        objEmpleado.Telefono=15645956;
        objEmpleado.Email="joaquindenisperez@gmail.com";
        
        System.out.println(objEmpleado.Apellido);
        System.out.println(objEmpleado.Nombre);;
        System.out.println(objEmpleado.DNI);
        System.out.println(objEmpleado.Telefono);;
        System.out.println("Email: "+objEmpleado.Email);
    }
}
