public class EjemploAutomovilStatic {
    public static void main(String[] args ) {


        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impreza");
        subaru.setCilindrada(2.0f);
        subaru.setColor("Blanco");
    
        Automovil mazda = new Automovil();
        
        mazda.setModelo("BT-50");
        mazda.setCilindrada(3.0f);
        mazda.setColor("Rojo");
        System.out.println(Automovil.getColorPatente());
    }
    
    
}
