import java.util.*;

public class Generated_636767581a6d9265ec017fc4 {
    public static long factorial(int n){
        if(n<1) return 1;
        else {
            long f = 1;
            for (int i = 2; i <= n; i++) {
                f *= i;
            }
            return f;
        }
    }
}