import java.util.Scanner;
import java.util.Random;

public class Samurai {
    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Equipo 1");
            System.out.println("Introduce potencia de los samurais:");
            String entrada1 = teclado.nextLine();

            String[] textos1 = entrada1.split(" ");
            int[] equipo1 = new int[textos1.length];
            int suma1 = 0;

            for (int i = 0; i < textos1.length; i++) {
                equipo1[i] = Integer.parseInt(textos1[i]);
                suma1 += equipo1[i];
            }

            if (suma1 != 30) {
                System.out.println("ERROR. La potencia total no suma 30.");

            }
            System.out.println("Equipo completado.");


            System.out.println("Equipo 2");
            System.out.println("Introduce potencia de los samurais:");
            String entrada2 = teclado.nextLine();
            String[] textos2 = entrada2.split(" ");

            int[] equipo2 = new int[textos2.length];
            int suma2 = 0;

            for (int i = 0; i < textos2.length; i++) {
                equipo2[i] = Integer.parseInt(textos2[i]);
                suma2 += equipo2[i];
            }

            if (suma2 != 30) {
                System.out.println("ERROR. La potencia total no suma 30.");

            }
            System.out.println("Equipo completado.");


            System.out.println("¡Empieza la batalla!");
            int samuraiInicial = random.nextInt(7) + 1;
            System.out.println("La batalla inicia con el Samurai " + samuraiInicial + ".");


            int bajas1 = 0;
            int bajas2 = 0;

            for (int samurai = 0; samurai < 7; samurai++) {
                int potencia1 = equipo1[samurai];
                int potencia2 = equipo2[samurai];

            System.out.println("Samurái " + (samurai + 1) + ". " + potencia1 + " vs " + potencia2);

            if (potencia1 > potencia2) {
                System.out.println("Gana Equipo 1. " + potencia1 + " vs " + potencia2);
                equipo2[samurai] = 0;
                bajas2++;
            } else if (potencia2 > potencia1) {
                System.out.println("Gana Equipo 2. " + potencia1 + " vs " + potencia2);
                equipo1[samurai] = 0;
                bajas1++;
            } else {
                System.out.println("EMPATE. Mueren ambos.");
                equipo1[samurai] = 0;
                equipo2[samurai] = 0;
                bajas1++;
                bajas2++;
            }


            if (bajas1 > 3) {
                System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + bajas1 + " bajas.");
                        break;
            }
            if (bajas2 > 3) {
                System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + bajas2 + " bajas.");
                break;
            }
        }
        }
    }

