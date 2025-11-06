package org.example;

import java.util.Arrays;
import java.util.Vector;

public class ejercicio2 {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5};
        int aux = 0;

        System.out.println(Arrays.toString(vector));

        for (int i = 0; i < vector.length / 2; i++) {
            aux = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = aux;
        }

        System.out.println(Arrays.toString(vector));
    }
}
