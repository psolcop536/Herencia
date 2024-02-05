package formas;

public class Circulo extends Elipse {
    /** @autor Pablo Soler
     * @ since 2024
     * @param color
     * @param centro
     * @param nombre
     * @param radio
     */
    public Circulo(String color, Punto centro, String nombre, double radio) {
        super(color, centro, nombre, radio, radio);
    }

}
