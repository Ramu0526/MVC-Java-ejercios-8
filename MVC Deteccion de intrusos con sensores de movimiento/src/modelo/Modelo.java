package modelo;

import java.util.Random;

public class Modelo {
    private final Random random = new Random();
    private final boolean esNoche;

    public Modelo() {
        this.esNoche = random.nextBoolean();
    }

    public boolean esNoche() {
        return esNoche;
    }

    public int validarSensores() {
        int detecciones = 0;
        for (int i = 0; i < 3; i++) {
            if (random.nextBoolean()) {
                detecciones++;
            }
        }
        return detecciones;
    }
}
