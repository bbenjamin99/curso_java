package models;

public class Persona {
    // attributes
    String nombre,apellido, numFiscal,direccion;

    
    // Constructor
    public Persona(){}

    public Persona(String nombre, String apellido){

    }
    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumFiscal() {
        return numFiscal;
    }

    public void setNumFiscal(String numFiscal) {
        this.numFiscal = numFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return " [ nombre= " + nombre + ", apellido= " + apellido + ", numFiscal= " + numFiscal + ", direccion= "
                + direccion + " ]";
    }

    


    
    
}
