package ejemplo;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionByZeroExeption{
    if(divisor == 0) {
        throw new DivisionByZeroExeption("No se puede dividir por cero!");
    }
    return numerador / (double)divisor;
}


}