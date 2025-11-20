import java.util.Arrays;
import java.util.Random;

public class matrices2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int matriz[][] = new int[aleatorio.nextInt(5) + 1][aleatorio.nextInt(5) + 1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(25) + 1;
            }
        }
        for (int fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[j][i];
            }
            System.out.println("Columna:" + i + " " + suma);
        }
        suma = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            suma += matriz[aleatorio.nextInt(matriz.length-1) + 1][i];
        }
        System.out.println("1 fila: " + suma);
    }
}
