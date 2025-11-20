import java.util.Arrays;
import java.util.Scanner;

public class matrices1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una matriz de tamaño 3x3");
        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }
        for (int fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("Nuero a buscar: ");
        int numero = teclado.nextInt();


        matriz:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("El numero " + numero + " se encuentra en la posición (" + i + " , " + j + ")");
                    break matriz;
                }
            }
        }
    }
}