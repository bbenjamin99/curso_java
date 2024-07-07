package org.bbenjamin.pooclasesabstractas.form.elementos;

abstract public class ElementoForm {

    // Attributes
    protected String valor;
    protected String nombre;

    //Constructor
    public ElementoForm() {

    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }
    

    // Getters & Setters
    public void setValor(String valor) {
        this.valor = valor;
    }


    // Methods
    abstract public String dibujarHtml();
}
