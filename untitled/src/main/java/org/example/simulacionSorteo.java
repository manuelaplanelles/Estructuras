import java.util.Scanner;
import java.util.Arrays;

public class simulacionSorteo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los datos de tu boleto (N-N-N-N-N-N/R):");
        String boleto = teclado.nextLine();

        // Validación con mensajes de error específicos
        if (!boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d")) {
            System.out.println("ERROR: Formato inválido.");
            System.out.println("Debes introducir exactamente 6 números separados por guiones (-)");
            System.out.println("seguidos de una barra (/) y un número de reintegro.");
            System.out.println("Ejemplo: 5-12-23-34-42-49/7");
            teclado.close();
            return;
        }

        String[] partes = boleto.split("[-/]");
        int[] datosUsuario = new int[7];

        for (int i = 0; i < partes.length; i++) {
            datosUsuario[i] = Integer.parseInt(partes[i]);
        }

        System.out.println("Formato válido");
        System.out.print("Tu boleto: [");
        for (int i = 0; i < 6; i++) {
            System.out.print(datosUsuario[i]);
            if (i < 5) System.out.print(", ");
        }
        System.out.println("]"); // CORREGIDO: cerrar corchete aquí
        System.out.println("Reintegro: " + datosUsuario[6]); // CORREGIDO: reintegro en línea separada

        // Sorteo de 6 números
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

        // Sorteo complementario
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

        // Sorteo reintegro
        int reintegroSorteo = (int) (Math.random() * 10);
        System.out.println("Reintegro: " + reintegroSorteo);

        // Comparación
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

        System.out.println("Aciertos: " + aciertos + " números");
        if (tieneComplementario) {
            System.out.println("¡Complementario acertado!");
        }
        if (tieneReintegro) {
            System.out.println("¡Reintegro acertado!");
        }

        System.out.println("RESULTADOS:");

        if (aciertos == 6 && tieneReintegro) {
            System.out.println("Categoría Especial.");
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