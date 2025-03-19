package modelo;
import java.util.Random;

public class Modelo {
    private final Random random;
    
    public Modelo() {
        this.random = new Random();
    }
    
    public double obtenerTemperatura() {
        return 20 + (random.nextDouble() * 15); 
        // Temperatura entre 20 y 35°C
    }
    
    public double obtenerHumedad() {
        return 40 + (random.nextDouble() * 40);
        // Humedad entre 40% y 80%
    }
    
    public boolean verificarAireAcondicionado(double temp, double humedad) {
        return (temp > 28 && humedad > 60) || temp > 30;
    }
}