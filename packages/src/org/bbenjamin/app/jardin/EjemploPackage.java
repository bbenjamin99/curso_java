package org.bbenjamin.app.jardin;

import org.bbenjamin.app.hogar.*;
import static org.bbenjamin.app.hogar.Persona.*;
public class EjemploPackage {
    public static void main (String[] args) {

        Persona p1 = new Persona();
        p1.setName("Benny");
        String saludo = p1.saludar();
        System.out.println(saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
        p1.setColor(Color.CAFE);
        System.out.println(generoMujer);
 
        System.out.println(generoMujer);
 
        Perro perro = new Perro();
        perro.name = "Rocco";
        perro.breedDog = "Raza Perro";

        String perroJugando = perro.jugar(p1);
        System.out.println(perroJugando);
    }
}
