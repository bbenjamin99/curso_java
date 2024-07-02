package org.bbenjamin.pooherencia;

public class Profesor extends Persona {

    // attributes
    private String subject;

    // Constructor
    public Profesor(){}
    public Profesor(String name, String lastname){
        super(name, lastname);
    } 
    public Profesor(String name, String lastname, String subject){
        this(name, lastname);
        this.subject = subject;
    } 

    // getters and setters

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    // Methods
    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar + " soy Profesor de : " + getSubject() +" y mi nombre es : " + getName();
    }

    @Override
    public String toString() {
        return super.toString() + "[subject=" + subject + "]";
    }

    

}
