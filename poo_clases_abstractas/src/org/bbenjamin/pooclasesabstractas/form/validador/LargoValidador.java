package org.bbenjamin.pooclasesabstractas.form.validador;

public class LargoValidador extends Validador{

    //Attributes
    protected String mensaje = "El campo debe tener entre %d y %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;


    //Constructor
    public LargoValidador(){}
    public LargoValidador(int min,int max){ 
        this.min = min;
        this.max = max;
    }
    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setMin(int min){
        this.min = min;
    }
    public void setMax(int max){
        this.max = max;
    }


    // Methods
    @Override
    boolean esValido(String valor) {
        this.mensaje = String.format(this.mensaje , this.min, this.max);

       if(valor == null) {
        return true;
       }
       int largo = valor.length();

       return largo >= min && largo <= max;
    }

}
