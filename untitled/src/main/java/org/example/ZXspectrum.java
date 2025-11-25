import java.util.Scanner;

public class ZXspectrum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean compAncho = false;

        do {
            System.out.println("Introduce la resolucion de tu pantalla (ancho x alto, multiplo de 8 y no mayor de 48): ");
            System.out.println("Ancho: ");
            int ancho = teclado.nextInt();
            System.out.println("Alto: ");
            int alto = teclado.nextInt();

            if (ancho % 8 == 0 && ancho <= 48 && ancho > 0) {
                compAncho = true;
            }
            if (ancho % 8 == 0 && ancho <= 48 && ancho > 0) {
                compAncho = true;
            }

        }while (compAncho==false);
    }
}
