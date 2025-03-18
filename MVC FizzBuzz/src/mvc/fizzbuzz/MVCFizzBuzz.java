package mvc.fizzbuzz;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class MVCFizzBuzz {
    public static void main(String[] args) {
        Modelo modelo = new Modelo(1, 100);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    }
}
