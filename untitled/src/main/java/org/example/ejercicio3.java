package org.example;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[25];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 101);
        }

        System.out.print("Ingresa un número para buscar [0,100]: ");
        int num = teclado.nextInt();

        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                contador++;
            }
        }
        System.out.println("El número " + num + " aparece " + contador + " veces en el array.");
    }
}
