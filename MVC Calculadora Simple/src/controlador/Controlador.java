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
        while (true) {
            String operacion = vista.obtenerOperacion();
            if (operacion.equals("SALIR")) {
                vista.mostrarError("Calculadora cerrada.");
                break;
            }
            double num1 = vista.obtenerNumero("Ingrese el primer número:");
            double num2 = vista.obtenerNumero("Ingrese el segundo número:");
            vista.mostrarResultado(modelo.calcular(num1, num2, operacion));
        }
        vista.cerrarScanner();
    }
}
