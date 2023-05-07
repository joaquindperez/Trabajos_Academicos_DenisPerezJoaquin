
package Ejercitacion.Herencia;

public class Ej6_Comercial extends Ej6_Empleados{
    private double comision;
    
    //CONSTRUCTOR

    public Ej6_Comercial(double comision, String Nombre, int Edad, double Salario) {
        super(Nombre, Edad, Salario);
        this.comision = comision;
    }

    //SET AND GET

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
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
        return super.toString()+ "Comercial{" + "comision=" + comision + '}';
    }
    public boolean plus() {
        if (super.getEdad()>30 && this.comision>200) {
            double nuevoSalario = super.getSalario() + super.PLUS;
               super.setSalario(nuevoSalario);
               System.out.println("Se le añadido el plus, al empleado" + super.getNombre());
               return true;
        }
        return false;
    }
}
