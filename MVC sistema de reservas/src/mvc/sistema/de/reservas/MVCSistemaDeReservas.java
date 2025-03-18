package mvc.sistema.de.reservas;

import Crontolador.Crontolador;
import Modelo.Modelo;
import Vista.Vista;

public class MVCSistemaDeReservas {
    public static void main(String[] args) {
        System.out.print("Este es un sistema de reservacion de cine donde tenemos 5 salas a escoger con 10 sillas disponibles ");
        Modelo modelo = new Modelo(5, 10); 
// 5 salas, 10 sillas por sala
        Vista vista = new Vista();
        Crontolador controlador = new Crontolador(modelo, vista);
        controlador.iniciar();
    }
}
