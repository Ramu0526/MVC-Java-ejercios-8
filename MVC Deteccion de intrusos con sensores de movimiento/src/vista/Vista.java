package vista;

public class Vista {
    public void mostrarTiempo(boolean esNoche) {
        System.out.println("Momento del día: " + (esNoche ? "Noche" : "Día"));
    }

    public void mostrarEstadoAlarma(boolean activada) {
        System.out.println(activada ? "Alarma activada: Intruso detectado!" : "Alarma desactivada: Todo en orden.");
    }
}