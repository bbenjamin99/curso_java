package org.bbenjamin.poointerfaces.imprenta;

import org.bbenjamin.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta{
    public static void main(String[] args ) {
        Curriculum cv1 = new Curriculum("Resúmen laboral...", "Benjamin Benitez", "Software Enginer");
        cv1.addExperiencia("JAVA Developer JR")
        .addExperiencia("Sring Framework")
        .addExperiencia("Soporte técnico");

        Informe informe1 = new Informe("Estudio sobre Micro servicios", "Benjamín Benitez","James Fowler ");
        Libro libro1 = new Libro("Benitez", "Road to Software Developer", Genero.ACCION);


        libro1.addPagina(new Pagina("Pagina 1..."))
        .addPagina(new Pagina("Pagina 2..."));

    

        imprimir(cv1);
        imprimir(informe1);
        imprimir(libro1);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}