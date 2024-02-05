package formas;

public class Rectangulo extends Forma {
    /**
     * @author Pablo Soler
     * @ since 2024
     * @ version 1.0
     * @param color
     * @param centro
     * @param nombre
     * @param ladoMayor
     * @param ladoMenor
     */
    private double ladoMenor;
    private double ladoMayor;

    public Rectangulo(String color, Punto centro, String nombre, double ladoMenor, double ladoMayor) {
        /** Constructor de la clase Rectangulo
         */
        super(color, centro, nombre);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    @Override
    public void imprimir() {
        /** Imprime la informacion de la clase*/
        super.imprimir();
        System.out.println("Lado Menor: " + ladoMenor);
        System.out.println("Lado Mayor: " + ladoMayor);
    }

    public double calcularArea() {
        /** Calcula el area de la clase
         */
        return ladoMenor * ladoMayor;
    }

    public double calcularPerimetro() {
        /** Calcula el perimetro de la clase
         */
        return 2 * ladoMenor + 2 * ladoMayor;
    }

    public void cambiarTamanio(double factorEscala) {
        /** Cambia el tamaño de la clase con factror escala
         */
        ladoMenor *= factorEscala;
        ladoMayor *= factorEscala;
    }

}
