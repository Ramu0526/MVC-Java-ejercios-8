package controlador;

import modelo.Modelo;
import vista.Vista;

public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion = vista.mostrarMenu();
        if (opcion == 2) {
            vista.mostrarMensaje("Saliendo del sistema...");
            return;
        }

        while (true) {
            double temperatura = modelo.leerTemperatura();
            vista.mostrarTemperatura(temperatura);
            String estado = modelo.monitorear(temperatura);
            vista.mostrarEstado(estado);
            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
