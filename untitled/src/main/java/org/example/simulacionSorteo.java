import java.util.Scanner;
import java.util.Arrays;

public class simulacionSorteo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       System.out.println("Introduce los datos de tu boleto:");
       String boleto = teclado.nextLine();

        if (!boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d")) {
            System.out.println("Formato inválido.");
            return;
        }


        String[] partes = boleto.split("[-/]");
        int[] datosUsuario = new int[7];

        for (int i = 0; i < partes.length; i++) {
            datosUsuario[i] = Integer.parseInt(partes[i]);
        }

        System.out.print("[");
        for (int i = 0; i < 6; i++) {
            System.out.print(datosUsuario[i]);
            if (i < 5) System.out.print(", ");
        }
        System.out.println(", " + datosUsuario[6] + "]");

        int[] sorteo = new int[6];
        boolean hayDuplicados;

        do {
            for (int i = 0; i < 6; i++) {
                sorteo[i] = (int) (Math.random() * 49) + 1;
            }

            hayDuplicados = false;
            for (int i = 0; i < sorteo.length - 1; i++) {
                for (int j = i + 1; j < sorteo.length; j++) {
                    if (sorteo[i] == sorteo[j]) {
                        hayDuplicados = true;
                        break;
                    }
                }
                if (hayDuplicados) break;
            }

        } while (hayDuplicados);

        Arrays.sort(sorteo);

        System.out.println("Ha salido:");
        System.out.print("[");
        for (int i = 0; i < sorteo.length; i++) {
            System.out.print(sorteo[i]);
            if (i < 5) System.out.print(", ");
        }
        System.out.println("]");

        int complementario;
        boolean coincide;

        do {
            complementario = (int) (Math.random() * 49) + 1;
            coincide = false;

            for (int i = 0; i < sorteo.length; i++) {
                if (complementario == sorteo[i]) {
                    coincide = true;
                    break;
                }
            }
        } while (coincide);

        System.out.println("Complementario: " + complementario);

        int reintegroSorteo = (int) (Math.random() * 10);
        System.out.println("Reintegro: " + reintegroSorteo);


        int aciertos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (datosUsuario[i] == sorteo[j]) {
                    aciertos++;
                    break;
                }
            }
        }

        boolean tieneComplementario = false;
        for (int i = 0; i < 6; i++) {
            if (datosUsuario[i] == complementario) {
                tieneComplementario = true;
                break;
            }
        }

        boolean tieneReintegro = (datosUsuario[6] == reintegroSorteo);


        System.out.println("RESULTADOS:");

        if (aciertos == 6 && tieneReintegro) {
            System.out.println("Categoría Especial.");
            System.out.println("Reintegro.");
        } else if (aciertos == 6) {
            System.out.println("1ª Categoría.");
        } else if (aciertos == 5 && tieneComplementario) {
            System.out.println("2ª Categoría.");
        } else if (aciertos == 5) {
            System.out.println("3ª Categoría.");
        } else if (aciertos == 4) {
            System.out.println("4ª Categoría.");
        } else if (aciertos == 3) {
            System.out.println("5ª Categoría.");
        } else if (tieneReintegro) {
            System.out.println("Reintegro.");
        } else {
            System.out.println("No premiado.");
        }
    }
}