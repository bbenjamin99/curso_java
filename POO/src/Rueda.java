public class Rueda {

    // Attributes
    private String fabricante;
    private int aro;
    private double ancho;

    // Constructor
    public Rueda() {

    }
    public Rueda(String fabricante, int aro, double ancho){

    }

    // getters and setters
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getFabricante(){
        return fabricante;
    }

    public void setAro(int aro){
        this.aro = aro;
    }
    public int getAro(){
        return aro;
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public double getAncho(){
        return ancho;
    }

}
