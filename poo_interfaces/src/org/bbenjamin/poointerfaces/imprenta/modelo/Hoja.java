package org.bbenjamin.poointerfaces.imprenta.modelo;

abstract public class Hoja {
    // Attributes
    protected String contenido;

    //Constructor
    public Hoja(){}
    public Hoja(String contenido) {
        this.contenido = contenido;
    }


    //Getters & Setters


    //Methods
    abstract public String imprimir();
}
