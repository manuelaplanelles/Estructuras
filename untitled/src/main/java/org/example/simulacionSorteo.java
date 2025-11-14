import java.util.Scanner;

public class simulacionSorteo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] validarFormato= null;

        System.out.println("Introduce los datos del boleto:");
        String boleto = teclado.nextLine();

        boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}");


    }while ();
    }
}
