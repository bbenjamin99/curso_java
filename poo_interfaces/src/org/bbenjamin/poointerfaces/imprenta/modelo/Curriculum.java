package org.bbenjamin.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    // Attributes
    private String persona;
    private String carrera;
    private List<String> experiencias;
    //Constructor
    public Curriculum(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }
     
    //getters & setters



    // methods
    public Curriculum addExperiencia(String experiencia) {
        this.experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {

        System.out.println("-------------------------------------------");
        StringBuilder sb = new StringBuilder("Nombre y apellido:  ").append(this.persona).append("\t | \n")
        .append("Resumen:").append(this.contenido).append("\t \t | \n")
        .append("Profesión: ").append(this.carrera).append("\t \t | \n")
        .append("Experiencias: ").append("\t \t \t \t | \n");
        for(String experiencia : this.experiencias) {
            sb.append(" - " + experiencia + "\t \t \t | \n" ); 
            
        }
        sb.append("-------------------------------------------");
        return sb.toString();
    };
 
}
