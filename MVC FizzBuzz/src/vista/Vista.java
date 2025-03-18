package vista;

import java.util.List;

public class Vista {
    public void mostrarResultados(List<String> resultados) {
        System.out.println("Resultados de FizzBuzz:");
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}
