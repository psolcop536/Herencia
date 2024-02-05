import java.util.Scanner;
import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        int op;
        String texto = "";
        Scanner teclado = new Scanner(System.in);
        Stack<String> pila = new Stack<String>();
        pila.push("primero");
        while (!pila.empty()) {
            System.out.println("Opción 1: Introducir elemento: ");
            System.out.println("Opción 2: Sacar elemento: ");
            do {
                op = teclado.nextInt();
            } while (op != 1 && op != 2);
            switch (op) {
                case 1:
                    teclado.nextLine();
                    System.out.print("Teclea cadena a introducir en la pila: ");
                    texto = teclado.nextLine();
                    pila.push(texto);
                    System.out.println("El numero de elementos en la pila es: " + pila.size());
                    break;
                case 2:
                    System.out.println("\nElemento sacado:" + pila.pop());
                    break;
            }
        }
    }
}