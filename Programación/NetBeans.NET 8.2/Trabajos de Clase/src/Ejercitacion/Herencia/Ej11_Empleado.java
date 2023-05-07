
package Ejercitacion.Herencia;

public abstract class Ej11_Empleado {
    protected String Nombre;
    protected String Apellido;
    protected int Edad;
    protected int AñosAntiguedad;
    protected int sueldo;

   //CONSTRUCTOR
    public Ej11_Empleado(String Nombre, String Apellido, int Edad, int AñosAntiguedad, int sueldo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.AñosAntiguedad = AñosAntiguedad;
        this.sueldo = sueldo;
    }
    //SET Y GET

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getAñosAntiguedad() {
        return AñosAntiguedad;
    }

    public void setAñosAntiguedad(int AñosAntiguedad) {
        this.AñosAntiguedad = AñosAntiguedad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
     public void SueldoMayor() {
     if (AñosAntiguedad>10) {
         System.out.println(this.sueldo*50);
     }
     }
     public void ComprobarNombre() {
         if(Nombre.equals("")) {
             System.out.println("El Nombre está vacío");
         }
     }
    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + ", A\u00f1osAntiguedad=" + AñosAntiguedad + ", sueldo=" + sueldo + '}';
    }
}
