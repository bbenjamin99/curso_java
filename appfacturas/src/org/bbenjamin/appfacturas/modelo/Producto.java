package org.bbenjamin.appfacturas.modelo;
public class Producto {

    // Attributes
    private int codigo;
    private String nombre;
    private float precio;

    private static int ultimoCodigo;

    // Constructor
    public Producto() {
        this.codigo = ++ultimoCodigo;
    }
    // Getters & Setters

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    

    

}
