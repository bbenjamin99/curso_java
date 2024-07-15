package org.bbenjamin.genericsClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable<Object>{
    
    // Attributes
    private List objetos;
    private int max = 10;

    //Constructor
    public Camion(int max) {
        this.max = max; 
        this.objetos = new ArrayList<>();
    }


    // Methods
    public void addObj(Object objeto) {

        if(this.objetos.size() <= max ) {
            this.objetos.add(objeto);

        } else {
            throw new RuntimeException("No hay mas espacio...");
        }
        
    }

    @Override
    public Iterator<Object> iterator() {
        return this.objetos.iterator();
    }
}
