package Ejercitacion.Herencia;

public class Ej1Empleado extends Ej1Persona{


        int sueldo;

        public Ej1Empleado(int sueldo, String nombre, int edad) {
            super(nombre, edad);
            this.sueldo = sueldo;
        }

        public int getSueldo() {
            return sueldo;
        }

        public void setSueldo(int sueldo) {
            this.sueldo = sueldo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void imprimir() {
            System.out.println("Nombre: " + getNombre() + "Edad: " + getEdad() + "Sueldo: " + getSueldo());
        }
    }

