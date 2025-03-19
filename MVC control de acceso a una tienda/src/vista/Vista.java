package vista;

public class Vista {
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarEstado(boolean accesoPermitido) {
        if (accesoPermitido) {
            System.out.println("Acceso concedido: ¡Bienvenido a la tienda!");
        } else {
            System.out.println("Acceso denegado: No puedes entrar en este momento.");
        }
    }
}