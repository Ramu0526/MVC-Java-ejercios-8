package modelo;

import java.util.Random;

public class Modelo {
    private Random random;

    public Modelo() {
        random = new Random();
    }

    public String monitorear(double temperatura) {
        if (temperatura < 10) {
            return "Estado: calefactor prendido";
        } else if (temperatura > 25) {
            return "Estado: Ventilador prendido";
        } else {
            return "Estado: Normal";
        }
    }

    public double leerTemperatura() {
        return 5 + (random.nextDouble() * 30);
    }
}