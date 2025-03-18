package Modelo;

import java.util.HashMap;

public class Modelo {
    private HashMap<Integer, boolean[]> salas;
    private int numSillas;

    public Modelo(int numSalas, int numSillas) {
        this.numSillas = numSillas;
        salas = new HashMap<>();
        for (int i = 1; i <= numSalas; i++) {
            salas.put(i, new boolean[numSillas]);
        }
    }

    public boolean sillaDisponible(int sala, int silla) {
        return !salas.get(sala)[silla - 1];
    }

    public void reservarSilla(int sala, int silla, String usuario) {
        if (sillaDisponible(sala, silla)) {
            salas.get(sala)[silla - 1] = true;
            System.out.println("Silla " + silla + " en sala " + sala + " reservada para " + usuario);
        } else {
            System.out.println("La silla ya esta ocupada.");
        }
    }

    public void mostrarDisponibilidad() {
        for (int sala : salas.keySet()) {
            System.out.print("Sala " + sala + ": ");
            for (int i = 0; i < numSillas; i++) {
                System.out.print(salas.get(sala)[i] ? "[X] " : "[ ] ");
            }
            System.out.println();
        }
    }
}
