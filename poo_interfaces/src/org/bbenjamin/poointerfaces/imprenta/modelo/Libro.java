package org.bbenjamin.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    // Attributes
    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    //Constructor
    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }



    // Methods
    
    public Libro addPagina(Imprimible pagina) {
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ").append(this.titulo).append("\n")
        .append("Género: ").append(this.genero).append("\n")
        .append("Autor: ").append(this.autor).append("\n");
        for(Imprimible pag : paginas) {
            sb.append(pag.imprimir() + "\n");
        }   
        return sb.toString();
    }
}
