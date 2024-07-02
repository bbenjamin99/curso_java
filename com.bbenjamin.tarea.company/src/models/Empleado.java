package models;

public class Empleado extends Persona {
    // Attributes
    double remuneracion;
    int empleadoId;

    // Constructor
    public Empleado() {

    }
    
    public Empleado(String nombre, String apellido){
        super(nombre, apellido);
    }


    // Methods
    public int aumentarRemuneracion() {
        // En porcentaje
        return 0;
    }
}
