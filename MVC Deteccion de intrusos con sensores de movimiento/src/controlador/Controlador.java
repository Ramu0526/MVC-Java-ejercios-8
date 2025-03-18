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
        vista.mostrarTiempo(modelo.esNoche());
        int sensoresActivados = modelo.validarSensores();
        boolean alarmaActivada = modelo.esNoche() && sensoresActivados >= 2;
        vista.mostrarEstadoAlarma(alarmaActivada);
    }
}
