package org.bbenjamin.genericsClass;

public class EjemploGenericosClass {

    public static <T> void imprimirCamion(Camion<T> camion) {
        for(T o : camion) {
            if( o instanceof Animal) {
                System.out.println(((Animal) o).getNombre() + "Tipo: " + ((Animal)o).getTipo());
            }
            if(o instanceof Maquinaria) {
                System.out.println(((Maquinaria) o).getTipo());
            }

            if( o instanceof Automovil) {
                System.out.println(((Automovil) o).getMarca());
            }

        }   
    }
    public static void main(String[] args) {
        
        Camion<Animal> transporteCaballos = new Camion<>(5);

        Animal caballo1 = new Animal("Hourse", "Caballo");
        

        transporteCaballos.addObj(new Animal("Peregrino", "Caballo"));
        transporteCaballos.addObj(new Animal("Grillo", "Caballo"));
        transporteCaballos.addObj(new Animal("Tunquen", "Caballo"));
        transporteCaballos.addObj(new Animal("Topocalma", "Caballo"));
        transporteCaballos.addObj(caballo1);

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transMaquinarias = new Camion<>(3);
        transMaquinarias.addObj(new Maquinaria("Bulldozer"));
        transMaquinarias.addObj(new Maquinaria("Grua Horquilla"));
        transMaquinarias.addObj(new Maquinaria("Perforadora"));

        imprimirCamion(transMaquinarias);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.addObj(new Automovil("Volkswagen Gol"));
        transAuto.addObj(new Automovil("Mercedes-Benz Class A"));
        transAuto.addObj(new Automovil("Chevrolet Camaro"));

        imprimirCamion(transAuto);

    }
}
