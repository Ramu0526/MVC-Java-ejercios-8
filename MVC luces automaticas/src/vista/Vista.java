package vista;

public class Vista {
    public void mostrarEstado(String estado) {
        System.out.println(estado);
    }

    public void mostrarLuces(boolean encendidas) {
        System.out.println(encendidas ? "Luces encendidas" : "Luces apagadas");
    }
}
