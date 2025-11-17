import java.util.Scanner;

public class ejercio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el valor m:");
        int m = teclado.nextInt();
//recorretodos los numero y el de dentro si es primo o no
        primos:
        for (int i=2; i<=m;i++){
            for (int j=2;j<i;j++){
                if (i% j==0){
                    continue primos;
                }
            }
            System.out.print(i+"");

        }
    }
}
