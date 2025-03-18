package modelo;

import java.util.ArrayList;

public class Modelo {
    private int inicio;
    private int fin;
    private final ArrayList<String> resultados;

    public Modelo(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
        this.resultados = new ArrayList<>();
    }

    public ArrayList<String> calcularFizzBuzz() {
        for (int i = inicio; i <= fin; i++) {
            String resultado = "";
            if (i % 3 == 0) resultado += "Fizz";
            if (i % 5 == 0) resultado += "Buzz";
            if (resultado.isEmpty()) resultado = String.valueOf(i);
            resultados.add(resultado);
        }
        return resultados;
    }
}
