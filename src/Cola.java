import java.util.*;
public class Cola {
    public static void main(String[] args) {
        int op;
        String texto = "";
        Scanner teclado = new Scanner(System.in);
        Queue<String> cola1 = new LinkedList<String>();
        cola1.offer("primero");
        while (!cola1.isEmpty()) {
            System.out.println("Opción 1: Cadena a introducir en la cola: ");
            System.out.println("Opción 2: Extraer cadena: ");
            System.out.println("Opción 3: Ver cadena sin extraer: ");
            System.out.println("Opción 4: Listar");
            System.out.println("Opción 5: Vaciar cola");
            do {
                op = teclado.nextInt();
            } while (op < 1 || op > 5);
            teclado.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Cadena a introducir: ");
                    texto = teclado.nextLine();
                    cola1.offer(texto);
                    break;
                case 2:
                    System.out.println("Elemento: " + cola1.poll());
                    break;
                case 3:
                    System.out.println("Elemento: " + cola1.peek());
                    break;
                case 4:
                    System.out.println("Listado de elementos de la cola: ");
                    for (String valor : cola1) System.out.println(valor);
                    break;
                case 5:
                    System.out.println("Borramos toda la cola");
                    cola1.clear();
            }
        }
    }
}