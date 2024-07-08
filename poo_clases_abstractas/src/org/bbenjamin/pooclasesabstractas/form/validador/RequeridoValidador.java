package org.bbenjamin.pooclasesabstractas.form.validador;

public class RequeridoValidador extends Validador {

    // Attributes
    protected String mensaje = "El campo es requerido...";

    // Getters & Setters
   

    @Override
    public String getMensaje() {

        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    // Methods
    @Override
    boolean esValido(String valor) {
        return ( valor != null && !valor.isBlank() ); // isBlank() asegura de que no solo no esté vacío, sino, que no tenga espacios en blanco
         
    }




}
