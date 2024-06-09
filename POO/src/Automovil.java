public class Automovil {
    // Props
   private String fabricante;
   private String modelo;
   private String color = "Gris";
   private double cilindrada;
   private int capacidadTanque = 40;

    // Getters & Setters
    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }



    // Methods
    public String detalle(){
        
        StringBuilder sb = new StringBuilder();
        sb.append(this.fabricante).
        append("\n" + this.modelo).
        append("\n" +this.color).
        append("\n" +this.cilindrada);

        String detalle = sb.toString();
        return detalle;
    }

    public String acelerar(int rpm) {

        return "El auto " + fabricante + " acelerando a : " + rpm;
    }

    public String frenar() {
        return "El auto " + fabricante + " esta frenando...!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + " " + frenar;
    }

    public float calcularConsumo(int km , float porcentajeCombustible) {

        return km / ( porcentajeCombustible * capacidadTanque);
    }

    public float calcularConsumo(int km , int porcentajeCombustible) {

        return km / ( porcentajeCombustible * capacidadTanque/100f);
    }

}
