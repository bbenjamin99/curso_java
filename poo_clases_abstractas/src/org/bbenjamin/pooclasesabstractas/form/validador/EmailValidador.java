package org.bbenjamin.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador {

    // Attributes
    protected String mensaje = "El formato del email es inválido";
    private final static String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
    @Override
    public String getMensaje() {

        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    //Methods
    @Override
    boolean esValido(String valor) {
        
        return valor.matches(EMAIL_REGEX);
    }

    

}
