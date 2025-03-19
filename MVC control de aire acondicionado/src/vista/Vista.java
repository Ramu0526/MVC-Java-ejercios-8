package vista;

public class Vista {
    public void mostrarEstado(double temperatura, double humedad, boolean aireEncendido) {
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Humedad: " + humedad + "%");
        System.out.println("Aire Acondicionado: " + (aireEncendido ? "Encendido️" : "Apagado"));
        System.out.println("-----------------------------");
    }
}
