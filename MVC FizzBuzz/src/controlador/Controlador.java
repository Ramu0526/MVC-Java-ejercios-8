package controlador;

import modelo.Modelo;
import vista.Vista;
import java.util.List;

public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        List<String> resultados = modelo.calcularFizzBuzz();
        vista.mostrarResultados(resultados);
    }
}
