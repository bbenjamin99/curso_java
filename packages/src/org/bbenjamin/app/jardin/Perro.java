package org.bbenjamin.app.jardin;

import org.bbenjamin.app.hogar.Persona;

 class Perro {

    // Att
    protected String name;
    protected String breedDog;


    // Method
     String jugar(Persona persona) {
        return persona.lanzarPelota();
    }

}
