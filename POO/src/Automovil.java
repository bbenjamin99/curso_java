public class Automovil {
    // Props
    String fabricante;
    String modelo;
    String color = "Gris";
    double cilindrada;



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

        return acelerar(rpm) + " " + frenar;


    }

}
