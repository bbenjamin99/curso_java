package org.bbenjamin.threads.examples;

import org.bbenjamin.threads.examples.threads.*;

public class EjemploExtenderThread {

    public static void main(String[] args){

        Thread hilo1 = new NombreThread("Hilo Benito");

        hilo1.start();

        Thread hilo2 = new NombreThread("Micaelita Hilo");

        hilo2.start();
        // Thread.sleep(3000);

        NombreThread hilo3 = new NombreThread("Rocko Pepe");
        hilo3.start();


        System.out.println(hilo1.getState());



    }
}
