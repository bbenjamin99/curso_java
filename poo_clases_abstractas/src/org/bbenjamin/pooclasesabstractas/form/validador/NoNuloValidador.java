package org.bbenjamin.pooclasesabstractas.form.validador;

public class NoNuloValidador extends Validador{

    // Attribute
    protected String mensaje = "El campo no puede ser Nulo";
    //Getters & Setters
    @Override
    public String getMensaje(){
        return mensaje;
    }
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    // Methods
    @Override
    public boolean esValido(String valor) {
        return (valor != null);
    }

}
