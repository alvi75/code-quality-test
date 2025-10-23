import java.util.*;

public class Generated_636767581a6d9265ec017fc4 {
    public static long factorial(int n){
        if(n < 0) throw new IllegalArgumentException("n must be >= 0");
        if(n == 0 || n == 1) return 1;
        long result = 2;
        for(int i = 3; i <= n; i++){
            result *= i;
        }
        return result;
    }
}