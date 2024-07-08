package org.bbenjamin.pooclasesabstractas.form.validador;

abstract public class Validador {

    // Attribute
    protected String mensaje;
    // Getters & Setters
    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();
    // Method
    abstract boolean esValido(String valor);
}
