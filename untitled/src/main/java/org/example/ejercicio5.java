import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio5 {
    static void main() {
        Random aleatorio = new Random();
        int [] num = {1, 2, 3, 4, 5};
        int numAux = num [0];

       for (int i = 0; i < num.length - 1; i++){
           num[i+1] = num[i];
       }
       num[num.length -1]=numAux;
        System.out.println(Arrays.toString(num));
    }
}
