package Vista;

import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String obtenerNombreUsuario() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    public int obtenerNumeroSala() {
        System.out.print("Ingrese el numero de la sala: ");
        return scanner.nextInt();
    }

    public int obtenerNumeroSilla() {
        System.out.print("Ingrese el numero de la silla: ");
        return scanner.nextInt();
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
