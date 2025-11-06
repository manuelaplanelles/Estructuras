package org.example;

public class ejercicio1 {
    public static void main(String[] args) {
        int[] vectores = {45, 120, 78, 200, 33, 156, 89, 250};

        System.out.println("Elementos del array:");
        for (int i = 0; i < vectores.length; i++) {
            System.out.print(vectores[i] + " ");
        }
        System.out.println();


        int suma = 0;
        for (int i = 0; i < vectores.length; i++) {
            suma += vectores[i];
        }


        System.out.println("La suma de los elementos es: " + suma);
    }
}