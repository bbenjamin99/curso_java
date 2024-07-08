package org.bbenjamin.pooclasesabstractas.form.validador;

public class NumeroValidador extends Validador {

    // Attributes
    protected String mensaje = "El campo debe ser un número";
    

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

        try {
            Integer.parseInt(valor);
            return true;

        } catch (NumberFormatException e) {
            System.out.println(e);
            return false;
        }
    }
    

}
