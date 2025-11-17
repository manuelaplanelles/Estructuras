import java.util.Scanner;

public class ejercio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura:");
        int altura = teclado.nextInt();

        for (int i=0;i<altura;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
