package org.bbenjamin.pooclasesabstractas.form.elementos;

public class InputForm extends ElementoForm{

    // Methods
    private String tipo = "text";

    // Constructor
    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    // Getters & Setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    // methods
    @Override
    public String dibujarHtml() {

        return "<input type=\""+ this.tipo
         +"\" name=\""+ this.nombre 
         +"\" value=\""+ this.valor
         + "\" >";

    }
}
