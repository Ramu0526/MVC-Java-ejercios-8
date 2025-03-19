package controlador;

import modelo.Modelo;
import vista.Vista;

public class Controlador {
    private final Modelo modelo;
    private final Vista vista;
    
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void iniciar() {
        while (true) {
            double temperatura = modelo.obtenerTemperatura();
            double humedad = modelo.obtenerHumedad();
            boolean aireEncendido = modelo.verificarAireAcondicionado(temperatura, humedad);
            vista.mostrarEstado(temperatura, humedad, aireEncendido);
            
            try {
                Thread.sleep(10000); 
                // Simula lectura cada 10 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
