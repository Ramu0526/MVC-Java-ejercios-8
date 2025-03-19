package mvc.control.de.acceso.a.una.tienda;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class MVCControlDeAccesoAUnaTienda {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    }
}