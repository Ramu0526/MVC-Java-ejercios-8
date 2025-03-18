package Crontolador;

import Modelo.Modelo;
import Vista.Vista;

public class Crontolador {
    private Modelo modelo;
    private Vista vista;

    public Crontolador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        while (true) {
            modelo.mostrarDisponibilidad();
            String usuario = vista.obtenerNombreUsuario();
            int sala = vista.obtenerNumeroSala();
            int silla = vista.obtenerNumeroSilla();

            if (modelo.sillaDisponible(sala, silla)) {
                modelo.reservarSilla(sala, silla, usuario);
                vista.mostrarMensaje("Reserva confirmada.");
            } else {
                vista.mostrarMensaje("Esa silla ya esta ocupada.");
            }
        }
    }
}
