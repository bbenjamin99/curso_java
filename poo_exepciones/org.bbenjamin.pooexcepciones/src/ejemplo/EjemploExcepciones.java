package ejemplo;

import javax.swing.JOptionPane;

public class EjemploExcepciones {
    public static void main(String[] args) 
    {
        String valor =  JOptionPane.showInputDialog("Ingrese un entero");
        
        int divisor;
        try {
            divisor = Integer.parseInt(valor);
            int division = 10 / divisor;
            System.out.println("La division es :" + division);
        } catch(NumberFormatException nfe) {
            System.out.println("Se detectó una excepcion, por favor ingrese un valor numérico" + nfe.getMessage());
        }
        
        catch (ArithmeticException ae) {
            System.out.println("Capturamos la excepcion:" + ae.getMessage());
        } finally {
            System.out.println("Es opcional pero se ejecuta siempre con excepcion o sin...");
        }

        System.out.println("Continúo con la ejecución       ");
    }
}
