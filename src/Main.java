package formas;

public class Main {
    /**
     * @param args
     * @autor Pablo Soler
     * @ since 2024
     * @version 1.0
     * @see https://github.com/PabloSoler
     */

    public static void main(String[] args) {
        Punto puntoCentro = new Punto(0.0, 0.0);
        Punto puntoCentro1 = new Punto(7.4, 9.1);
        Punto puntoCentro2 = new Punto(2.5, 7.9);

        /** Formas */
        Forma forma = new Forma("Blanco", puntoCentro, "Forma");
        Rectangulo rectangulo = new Rectangulo("Azul", puntoCentro, "Rectángulo 1: ", 5.0, 10.0);
        Elipse elipse = new Elipse("Verde", puntoCentro, "Elipse 1: ", 8.0, 4.0);
        Cuadrado cuadrado = new Cuadrado("Amarillo", puntoCentro2, "Cuadrado 1: ", 6.0);
        Circulo circulo = new Circulo("Naranja", puntoCentro, "Círculo 1: ", 12.0);

        /** Operaciones*/
        forma.imprimir();
        System.out.println();

        rectangulo.imprimir();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        /** Imprimir datos actualizados del rectángulo */
        System.out.println("\nDatos Actualizados del Rectángulo:");
        rectangulo.cambiarNombre("Rectangulo 1 modificado");
        rectangulo.cambiarColor("Rojo");
        rectangulo.cambiarTamanio(1.5);
        rectangulo.moverForma(puntoCentro2);
        rectangulo.imprimir();
        System.out.println("Área Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro Rectángulo: " + rectangulo.calcularPerimetro());

        /** Imprimir datos del Elipse */
        System.out.println("\nDatos del Elipse:");
        elipse.imprimir();
        System.out.println("Área de la elipse: " + elipse.calcularArea());
        System.out.println();
        /** Imprimir datos del Cuadrado */
        cuadrado.imprimir();
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println();
        /** Imprimir datos del Círculo */
        circulo.imprimir();
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
