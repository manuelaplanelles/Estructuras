import java.util.Arrays;

public class ejercicio6 {
    static void main() {
        int[] vector = {1, 2, 3, 2, 1};

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] == vector[vector.length - 1 - i]) {
                System.out.println("No es");
                break;
            }
        }
            System.out.println("Es palindromo");
        }
    }
