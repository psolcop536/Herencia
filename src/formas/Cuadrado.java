package formas;

public class Cuadrado extends Rectangulo {
    /** @autor Pablo Soler
     * @ since 2024
     * @ version 1.0
     * @param color
     * @param centro
     * @param nombre
     * @param lado
     */
    public Cuadrado(String color, Punto centro, String nombre, double lado) {
        super(color, centro, nombre, lado, lado);
    }
}
