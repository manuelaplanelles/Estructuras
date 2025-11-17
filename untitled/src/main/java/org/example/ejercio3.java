import java.util.Scanner;

public class ejercio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maximo= teclado.nextInt();
        tabla:

        for (int i=1;i<10;i++){
            System.out.println("Tabla del"+i);

            for (int j=1;j<=10;j++){
                System.out.println(i+"x"+j +"="+(i*j));

                if(i*j>maximo){
                    break tabla;
                }
            }
        }
    }
}
