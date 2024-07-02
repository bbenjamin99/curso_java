package org.bbenjamin.pooherencia;

public class Persona {

    // Attributes
    private String name;
    private String lastname;
    private int age;
    private String email;
    
    // Constructor 
    public Persona() {
        
    }

    public Persona(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public Persona(String name, String lastname, int age){
        this(name, lastname);
        this.age = age;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Methods
    public String saludar() {
        return "Hola, que tal!";
    }

    @Override
    public String toString() {
        return "[name=" + name + ", lastname=" + lastname + ", age=" + age + ", email=" + email + " Saludo= " + this.saludar() +  "]";
    }

    

}
