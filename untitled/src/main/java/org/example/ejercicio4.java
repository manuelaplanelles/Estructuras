import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        int i = 0;

        int [] vector = {1,3,5,7,9};

        int nuevo [] = new int[vector.length-1];

        int posicion_borrar=2;

        for (int i = 0; i < nuevo.length; i++);

        if (i >= posicion_borrar){
            nuevo[i]=vector[i+1];
        }else{
            nuevo[i]=vector[i];
        }
        System.out.println(Arrays.toString(nuevo));
    }
}
