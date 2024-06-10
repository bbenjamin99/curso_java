public class Motor {

    // Attributes
    private double cilindrada;
    private String tipo;

    // Constructor
    public Motor(){}

    public Motor(double cilindrada, String tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }
    

    // Getters & Setters
    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String tipo(){
        return tipo;
    }
}
