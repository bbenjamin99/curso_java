package org.bbenjamin.poointerfaces.imprenta.modelo;

public class Pagina extends Hoja implements Imprimible{

    // Constructor
    public Pagina(String contenido){
        super(contenido);
    }

     // Methods
     @Override
     public String imprimir() {
         return this.contenido;
     }
}
