public class Persona {

    // Attributes
    private String name;
    private String lastname;

    // Constructor
    public Persona(){

    }

    public Persona(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    // getters & setters
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname(){
        return lastname;
    }
}
