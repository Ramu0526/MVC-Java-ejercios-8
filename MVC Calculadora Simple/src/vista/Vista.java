package vista;

import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);
    }

    public String obtenerOperacion() {
        System.out.println("Seleccione la operación: SUMA, RESTA, MULTIPLICACION, DIVISION o SALIR");
        return scanner.nextLine().toUpperCase();
    }

    public double obtenerNumero(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    public void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
