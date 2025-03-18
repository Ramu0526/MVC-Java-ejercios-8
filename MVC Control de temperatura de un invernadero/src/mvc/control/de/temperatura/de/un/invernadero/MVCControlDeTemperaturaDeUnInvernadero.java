package mvc.control.de.temperatura.de.un.invernadero;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class MVCControlDeTemperaturaDeUnInvernadero {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    }
}
