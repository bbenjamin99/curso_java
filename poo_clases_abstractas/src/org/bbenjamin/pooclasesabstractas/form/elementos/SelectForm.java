package org.bbenjamin.pooclasesabstractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

import org.bbenjamin.pooclasesabstractas.form.elementos.select.Opcion;

public class SelectForm extends ElementoForm {

    //Attributes
     private List<Opcion> opciones;

    // Constructor
    public SelectForm(String nombre){
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones){
        this(nombre);
        this.opciones = opciones;
    }

    // Method
    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this; 
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name=' " ).append(this.nombre).append("'>");

        for (Opcion opcion : this.opciones) {
            sb.append("\n <option value=' ").append(opcion.getValor());
            
            if(opcion.isSelected() ) {
                sb.append(" selected");
                this.valor = opcion.getValor();
            }
            
            sb.append("'>")
            .append(opcion.getNombre())
            .append("</option>");
            }

            sb.append("</select>");

         return sb.toString();
    }

    

}
