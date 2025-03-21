package mvc.control.de.aire.acondicionado;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class MVCControlDeAireAcondicionado {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    }
}
