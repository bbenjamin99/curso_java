
public class Automovil {

    // Props
    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindrada;
    private int capacidadTanque = 40;

    static String colorPatente = "Naranja";

    public static final int VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;


    // Constructor
    public Automovil() {

    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante,modelo, color);
        this.cilindrada = cilindrada;
    }

    // Getters & Setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Methods
    public String detalle() {

        StringBuilder sb = new StringBuilder();
        sb.append(this.fabricante).
                append("\n" + this.modelo).
                append("\n" + this.color).
                append("\n" + this.cilindrada).
                append("\n" + this.colorPatente);

        String detalle = sb.toString();
        return detalle;
    }

    public String acelerar(int rpm) {

        return "El auto " + fabricante + " acelerando a : " + rpm;
    }

    public String frenar() {
        return "El auto " + fabricante + " esta frenando...!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + " " + frenar;
    }

    public float calcularConsumo(int km, float porcentajeCombustible) {

        return km / (porcentajeCombustible * capacidadTanque);
    }

    public float calcularConsumo(int km, int porcentajeCombustible) {

        return km / (porcentajeCombustible * capacidadTanque / 100f);
    }

    public static String getColorPatente(){
        return colorPatente;
    }


    @Override
    public boolean equals(Object obj){

        if(this == obj) {
            return true;
        }

        if(!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil)obj;   

        return (this.fabricante != null &&
                this.modelo != null &&
                this.fabricante.equals(a.getFabricante())&& 
                this.modelo.equals(a.getModelo() ));

    }

    @Override
    public String toString() {
        return "Automovil [fabricante=" + fabricante + ", modelo=" + modelo + ", color=" + color + ", cilindrada="
                + cilindrada + ", capacidadTanque=" + capacidadTanque + "]";
    }

    
}
