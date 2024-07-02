package models;

public class Gerente extends Empleado{
    // Attributes
    double presupuesto;

    // Constructor
    public Gerente(){

    }

    public Gerente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Gerente(String nombre, String apellido, double presupuesto) {
        this(nombre,apellido);
        this.presupuesto = presupuesto;
    }


    // Getters & Setters
    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString(){
       return "Hola, soy el gerente: " + super.toString();
    }



    

}
