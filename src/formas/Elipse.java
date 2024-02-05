package formas;

public class Elipse extends Forma {
    /** @autor Pablo Soler
     * @ since 2024
     * @version 1.0
     * @param color
     * @see https://github.com/PabloSoler
     * @param centro
     * @param nombre
     * @param radioMayor
     * @param radioMenor
     */
    private double radioMayor;
    private double radioMenor;

    public Elipse(String color, Punto centro, String nombre, double radioMayor, double radioMenor) {
        /** Constructor de la clase Elipse
         */
        super(color, centro, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public double calcularArea() {
        return Math.PI * radioMayor * radioMenor;
    }
}
