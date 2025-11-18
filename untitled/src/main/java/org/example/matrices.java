public class matrices {
    public static void main(String[] args) {
        int matriz[][]={{1,2,3},{4,5,6},{7,8,9}};
        int matriz2[][]=new int[3][3];

        System.out.println(matriz[1][2]);
        System.out.println(matriz[2][0]);

        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length;j++){
                System.out.print(matriz[i][j]);
        }
            System.out.println();
        }
    }
}
