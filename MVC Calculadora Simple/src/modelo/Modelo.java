package modelo;

public class Modelo {
    public double calcular(double num1, double num2, String operacion) {
        return switch (operacion) {
            case "SUMA" -> num1 + num2;
            case "RESTA" -> num1 - num2;
            case "MULTIPLICACION" -> num1 * num2;
            case "DIVISION" -> (num2 != 0) ? num1 / num2 : Double.NaN;
            default -> Double.NaN;
        };
    }
}
