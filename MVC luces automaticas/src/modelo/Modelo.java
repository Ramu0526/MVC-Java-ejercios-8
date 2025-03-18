package modelo;

import java.util.Random;

public class Modelo {
    private boolean esNoche;
    private boolean hayMovimiento;
    private Random random;

    public Modelo() {
        this.random = new Random();
    }

    public void actualizarEstado() {
        esNoche = random.nextBoolean();
        hayMovimiento = random.nextBoolean();
    }

    public boolean lucesEncendidas() {
        return esNoche && hayMovimiento;
    }

    public String obtenerEstado() {
        return "Noche: " + esNoche + " | Movimiento: " + hayMovimiento;
    }
}
