import java.lang.reflect.Array;
import java.util.Arrays;

public class duplicados_distintos {
    public static void main(String[] args) {
        int numeritos[] = {1,2,2,3,4,5,6,6};
        int numeritos_limpio[] = Arrays.stream(numeritos).distinct().toArray();
        System.out.println(Arrays.toString(numeritos_limpio));
    }
}
