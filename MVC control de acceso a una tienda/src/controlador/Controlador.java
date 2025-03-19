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
            boolean tieneMembresia = modelo.tieneMembresia();
            boolean esEmpleado = modelo.esEmpleado();
            boolean enHorario = modelo.enHorarioAtencion();

            vista.mostrarMensaje("Verificando acceso...");
            boolean accesoPermitido = (tieneMembresia && enHorario) || esEmpleado;
            vista.mostrarEstado(accesoPermitido);

            try {
                Thread.sleep(5000); 
                // Espera 5 segundos antes de la siguiente validación
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}