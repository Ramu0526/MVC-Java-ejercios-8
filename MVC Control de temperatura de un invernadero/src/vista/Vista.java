package vista;

import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Bienvenido al sistema de invernadero");
        System.out.println("1. Iniciar sistema");
        System.out.println("2. Salir");
        return scanner.nextInt();
    }

    public void mostrarTemperatura(double temperatura) {
        System.out.println("La temperatura actual es: " + temperatura + "°C");
    }

    public void mostrarEstado(String estado) {
        System.out.println(estado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}