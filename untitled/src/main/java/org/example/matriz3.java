import java.util.Arrays;
import java.util.Random;

public class matriz3 {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int tamanyo = aleatorio.nextInt(8) + 2;
        int matriz[][] = new int[tamanyo][tamanyo];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(50);
            }
        }
        for (int fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }
        for (int i = 0; i < matriz.length; i++) { //bucles virgenes
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
}
