package testbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import calculadora.ICalculadora;

@Service
public class MySpringCalculadoraBeanWithDependency {

    private ICalculadora calculadora;

    @Autowired
    public void setCalculadora(ICalculadora pCalculadora) {
        this.calculadora = pCalculadora;
    }

    public void run() {
        int x = 5;
        int y = 2;
        calculadora.calculadora(x, y);
    }
}
