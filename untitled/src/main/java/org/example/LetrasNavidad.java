import java.util.Arrays;
import java.util.Scanner;

public class LetrasNavidad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra:");
        String palabra = teclado.next();

        System.out.println("Cantidad de leras:");
        String letras = teclado.next();

        String palabra_vector []= palabra.split(" ");
        String letra_vector []= letras.split("-");

        System.out.println(Arrays.toString(palabra_vector));
        System.out.println(Arrays.toString(letra_vector));
        if (palabra_vector.length==letra_vector.length){

            for (int i=0; i<palabra_vector.length;i++){
                for (int j=0;j<Integer.parseInt(letra_vector[i]); j++) {
                    System.out.print(palabra_vector[i]);
                }
            }
        }else{
            System.out.println("No hay un numeo para cada letra...");
        }
    }
}
