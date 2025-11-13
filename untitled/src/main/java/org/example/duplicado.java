public class duplicado {
    public static void main(String[] args) {

        int[] origial = {2, 3, 3, 5, 6, 6, 10};
        int[] auxiliar = new int[origial.length];

        int tam = 1;
        auxiliar[0] = origial [1];

        for (int i = 0; i < origial.length; i++) {
            if (origial[i] != origial[i-1]){
                auxiliar[i-1]=origial[i-1];
                tam++;
            }
        }
   }
}