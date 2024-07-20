package ejemplo;

import javax.swing.JOptionPane;

public class EjemploExcepciones {
    /**
     * @param args
     * @throws DivisionByZeroExeption
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        
        int divisor;
        double division;

        try {
            divisor = Integer.parseInt(valor);
            division = calc.dividir(30, divisor);

            System.out.println("La division es :" + division);
        } catch(NumberFormatException nfe) {
            System.out.println("Se detectó una excepcion, por favor ingrese un valor numérico" + nfe.getMessage());
        }
        
        catch (DivisionByZeroExeption dce) {
            System.out.println("Capturamos la excepcion:" + dce.getMessage());
        } finally {
            System.out.println("Es opcional pero se ejecuta siempre con excepcion o sin...");
        }

        System.out.println("Continúo con la ejecución       ");
    }
}
