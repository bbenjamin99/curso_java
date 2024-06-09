
public class EjemploAutomovil {
    public static void main(String[] args)  {

        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impreza");
        subaru.setCilindrada(2.0f);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setCilindrada(3.0f);
        mazda.setColor("Rojo");

        Automovil audi = new Automovil("Audi", "A4", "Gris");
        Automovil audi2 = new Automovil("Audi", "A4", "Gris");

        System.out.println(audi == audi2);
        System.out.println(audi.equals(audi2));
        System.out.println(audi.toString());

        // System.out.println(subaru.detalle());
        // System.out.println(mazda.detalle());
        
        // System.out.println(subaru.acelerar(120));
        // System.out.println(subaru.frenar());

        // System.out.println(subaru.acelerarFrenar(123));

        // System.out.println("KM por litros: " +  subaru.calcularConsumo(300,0.75f) );
        // System.out.println("KM por litros: " +  subaru.calcularConsumo(300,60) );
       
    }
}
