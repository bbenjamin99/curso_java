package org.bbenjamin.app.hogar;

// import org.bbenjamin.app.jardin.Perro; // El perro no podría entrar a hogar , su clase está en package diferente al ser default

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        // Perro perro1 = new Perro(); Si la clase es 'default' no funciona
        // perro1.jugar(p1); Si la clase es default no funciona
        String saludo =  Persona.saludar(); 

    }

}
