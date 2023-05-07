
package Ejercitacion.Herencia;

public abstract class Ej6_Empleados {
     protected String Nombre;
    protected int Edad;
    protected double Salario;
    
    //CONSTANTES
    public final double PLUS = 300;
 //CONSTRUCTOR
    public Ej6_Empleados(String Nombre, int Edad, double Salario) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Salario = Salario;
    }
    //SET Y GET

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
        return "Empleados{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Salario=" + Salario + ", PLUS=" + PLUS + '}';
    }
    //Metodo abstracto, obliga a las clases hijas que implementen esta función
    public abstract boolean plus();
    
}
