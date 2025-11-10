import java.util.Arrays;
import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final String colores[] = {"rojo", "negro"};
        Integer numeros[] = new Integer[37];

        for (int i = 0; i < numeros.length; i++) ;
        numeros[i] = i;
    }
    final String par_impar[] = {"par", "impar"};

    System.out.printIn("Introduce tu número (0-36):")
    int numero_apuesta= teclado.nexline();

    if (Arrays.asList(numeros).contaoms(numero_apuesta)){
        System.out.printIn ("ERROR. El numero no es valido");
        return;

        }
    if (numero_apuesta!=0){
        System.out.println("Introduce el color:");
        String color_apuesta = teclado.next();
        if (!Arrays.asList(colores).contains(color_apuesta.toLowerCase())) {
            System.out.println("ERROR: El color debe ser rojo o negro");
            return;
        }
        System.out.println("Introduce par o impar:");
        String par_impar_apuesta = teclado.next();
        if (!Arrays.asList(par_impar).contains(par_impar_apuesta.toLowerCase())) {
            System.out.println("ERROR: La opcion debe ser par o impar");
            return;
        }

        String color_sorteo = colores[aleatorio.nexInt(2)];
        int numero_



    }
    }
    }
