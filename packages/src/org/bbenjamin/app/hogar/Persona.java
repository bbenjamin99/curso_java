package org.bbenjamin.app.hogar;


public class Persona {
    // Attributes
    private String name;
    private String lastname;
    private Color color;

    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";


    // Getters & Setters
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    
    public void setLastname(String lastname) {this.lastname = lastname;}
    public String getLastname(){return lastname;}

    public void setColor(Color color){
        this.color = color;
    }
    public Color getColor(){
        return this.color;
    }

    //Methods
    public String lanzarPelota() {
        return "Lanzando pelota!";
    }

    public static String saludar() {
        return "Saludando!";
    }

}
