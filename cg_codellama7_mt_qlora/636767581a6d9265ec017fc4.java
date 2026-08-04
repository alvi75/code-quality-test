import java.util.*;

public class Generated_636767581a6d9265ec017fc4 {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}