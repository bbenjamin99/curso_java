package org.bbenjamin.genericsClass;

public class EjemploGenericosClass {
    public static void main(String[] args) {
        
        Camion transporteCaballos = new Camion(5);

        Animal caballo1 = new Animal("Hourse", "Caballo");
        

        transporteCaballos.addObj(new Animal("Peregrino", "Caballo"));
        transporteCaballos.addObj(new Animal("Grillo", "Caballo"));
        transporteCaballos.addObj(new Animal("Tunquen", "Caballo"));
        transporteCaballos.addObj(new Animal("Topocalma", "Caballo"));
        transporteCaballos.addObj(caballo1);

        for(Object o : transporteCaballos) {
            Animal a = (Animal)o;

            System.out.println(a.getNombre());

        }

        Camion transMaquinarias = new Camion(3);
        transMaquinarias.addObj(new Maquinaria("Bulldozer"));
        transMaquinarias.addObj(new Maquinaria("Grua Horquilla"));
        transMaquinarias.addObj(new Maquinaria("Perforadora"));

        for(Object o : transMaquinarias) {
            Maquinaria maquina = (Maquinaria)o;
            System.out.println(maquina.getTipo());
        }

        Camion transAuto = new Camion(3);
        transAuto.addObj(new Automovil("Volkswagen Gol"));
        transAuto.addObj(new Automovil("Mercedes-Benz Class A"));
        transAuto.addObj(new Automovil("Chevrolet Camaro"));

        for(Object obj : transAuto) {
            Automovil auto = (Automovil)obj;

            System.out.println(auto.getMarca());
        }

    }
}
