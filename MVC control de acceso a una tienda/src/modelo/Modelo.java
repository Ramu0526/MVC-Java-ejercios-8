package modelo;

import java.util.Random;

public class Modelo {
    private Random random;

    public Modelo() {
        this.random = new Random();
    }

    public boolean tieneMembresia() {
        return random.nextBoolean();
    }

    public boolean esEmpleado() {
        return random.nextBoolean();
    }

    public boolean enHorarioAtencion() {
        return random.nextBoolean();
    }
}