    package org.bbenjamin.pooclasesabstractas.form.elementos.select;

public class Opcion {

    // Attributes
    private String valor;
    private String nombre;  
    private boolean selected;

    // Constructor
    public Opcion(){

    }
    public Opcion(String valor, String nombre){
        this.valor = valor;
        this.nombre = nombre;
    }
    

    // Getters & Setters

    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isSelected() {
        return selected;
    }
    public Opcion setSelected(boolean selected) {
        this.selected = selected;
        return this;
    }   
    
}