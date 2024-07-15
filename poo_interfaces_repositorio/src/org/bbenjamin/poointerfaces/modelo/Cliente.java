package org.bbenjamin.poointerfaces.modelo;

import java.util.Objects;

public class Cliente extends BaseEntity{

    //Attributes

    private String nombre;
    private String apellido;
    
 
    public Cliente(String nombre, String apellido){
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }
    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    // Methods

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        
        return sb.toString();

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.id, other.id);
    }

    
    



}
