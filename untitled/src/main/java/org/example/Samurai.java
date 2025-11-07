import java.util.Scanner;

public class Samurai {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Equipo 1");
        System.out.println("Introduce potencia de los samurais (7 números separados por espacios):");
        String entrada = teclado.nextLine();

        String[] textos = entrada.split(" ");

        int[] equipo1 = new int[7];
        for (int i = 0; i < 7; i++) {
            equipo1[i] = Integer.parseInt(textos[i]);
        }

        System.out.println("Equipo 1 cargado:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Samurái " + (i+1) + ": " + equipo1[i]);
        }
    }
}
