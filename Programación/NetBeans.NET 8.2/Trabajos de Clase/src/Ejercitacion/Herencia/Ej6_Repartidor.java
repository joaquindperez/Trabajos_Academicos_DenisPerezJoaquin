
package Ejercitacion.Herencia;

public class Ej6_Repartidor extends Ej6_Empleados{
     private String zona;
    
    //CONSTRUCTOR

    public Ej6_Repartidor(String zona, String Nombre, int Edad, double Salario) {
        super(Nombre, Edad, Salario);
        this.zona = zona;
    }
    //SET AND GET

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    //TO STRING

    @Override
    public String toString() {
        return "Repartidor{" + "zona=" + zona + '}';
    }
    public boolean plus() {
        if (super.Edad<25 && this.zona.equalsIgnoreCase("zona 3")){
            double NuevoSalario = super.Salario + super.PLUS;
            super.setSalario(NuevoSalario);
               System.out.println("Se le añadido el plus, al empleado" + super.getNombre());
               return true;
        }
        return false;
    }
}
