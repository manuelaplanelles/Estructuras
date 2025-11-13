import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        final String colores[] = {"rojo", "negro"};
        Integer numeros[] = new Integer[37];

        for (int i = 0; i < numeros.length; i++){
        numeros[i] = i;
         }

        final String par_impar[] = {"par", "impar"};

    System.out.println("Introduce tu número(0-36):");
    int numero_apuesta = teclado.nextInt();

    if (!Arrays.asList(numeros).contains(numero_apuesta)){
        System.out.println ("ERROR. El numero no es valido(0-36): ");
        return;
        }


        String par_impar_apuesta="";

        if (numero_apuesta!=0){

            System.out.println("Introduce color: ");
           // int color_apuesta = teclado.next();

            //if (!Arrays.asList(colores).contains(color_apuesta.toLowerCase())){
                System.out.println("ERROR. El color debe ser rojo-negro.");
                return;
            }

            System.out.println("Introduce par/impar: ");
            par_impar_apuesta = teclado.next();

            if (!Arrays.asList(par_impar).contains(par_impar_apuesta.toLowerCase())){
                System.out.println("ERROR. La opción debe ser par/impar.");
                return;
            }

        }
    }

