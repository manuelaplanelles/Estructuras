public class etiquetado {
    public static void main(String[] args) {
        bucle_fuera:
        for (int i=0;i<10; i++){
           System.out.println("Bucle fuera"+i);
            bucle_dentro:
            for (int j=0;j<5; j++){
                System.out.println("Bucle fuera"+j);
                if(j==4){
                    continue bucle_fuera;
                }
            }
        }
    }
}
