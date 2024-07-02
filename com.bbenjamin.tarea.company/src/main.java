import models.Gerente;

public class main {
    
    public static void main(String[] args) {
    
        System.out.println("Estanciando gerente.. :");
        System.out.println();
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("Benjamin");
        gerente1.setApellido("Benitez");
        gerente1.setPresupuesto(600);
        gerente1.setNumFiscal("20-42536814-2");

        System.out.println(gerente1.toString());
        
    }
}
