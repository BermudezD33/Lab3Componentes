package calculadora;

public class CalculadoraSumas implements ICalculadora {

    @Override
    public void calculadora(int x, int y) {
        int resultado = x + y;
        System.out.println("El resultado de la suma de: " + x + " + " + y + " es: " + resultado);
    }

}
