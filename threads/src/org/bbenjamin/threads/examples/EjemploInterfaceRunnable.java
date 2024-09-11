package org.bbenjamin.threads.examples;

import org.bbenjamin.threads.examples.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args){

        new Thread( new ViajeTarea( "New Zealand") ).start();
        new Thread( new ViajeTarea( "Denmark") ).start();
        new Thread( new ViajeTarea( "Canadá") ).start();
        new Thread( new ViajeTarea( "Germany") ).start();
    }
}
