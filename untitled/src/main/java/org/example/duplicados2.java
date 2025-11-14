import java.util.Arrays;
import java.util.Random;

public class duplicados2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numeros[] = new int[10];

        for (int i = 0; i< numeros.length; i++){
            numeros[i]= aleatorio.nextInt(18)+1;
        }
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        boolean comprobar = true;
        while (comprobar) {
            comprobar = false;
            for (int i = 0; i < numeros.length; i++) {
                if (i != numeros.length - 1 && numeros[i] == numeros[i + 1]) {

                    System.out.println("Duplicado: " + numeros[i]);
                    System.out.println(Arrays.toString(numeros));
                    numeros[i] = aleatorio.nextInt(10) + 1;
                    Arrays.sort(numeros);
                    comprobar = true;
                }
            }
        }

        }
    }
