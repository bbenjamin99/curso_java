package org.bbenjamin.threads.examples.threads;

public class NombreThread extends Thread {

    public NombreThread(String name){
        super(name);
    }
    @Override
    public void run() {
        
        System.out.println("Se inicia el metodo run del Thread: " + getName() );

        for(int i = 0; i < 10; i++){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            System.out.println(getName() );
        }
        System.out.println("Finaliza el Thread de " + getName());
    }

     

}
