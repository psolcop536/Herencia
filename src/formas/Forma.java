package formas;

public class Forma {
    /**
     * @autor Pablo Soler
     * Creacion de la clase Forma
     * @since 2024
     * @version 1.0
     * @param color
     * @param centro
     * @param nombre
      */

    protected String color;
    protected Punto centro;
    protected String nombre;
/*
*Constructor de la clase Forma
 */
    public Forma(String color, Punto centro, String nombre) {
        this.color = color;
        this.centro = centro;
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Centro: (" + centro.getX() + ", " + centro.getY() + ")");
    }

    public String obtenerColor() {
        return color;
    }

    public void cambiarColor(String nuevoColor) {
        color = nuevoColor;
    }
    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void moverForma(Punto nuevasCoordenadas) {
        centro = nuevasCoordenadas;
    }
}
