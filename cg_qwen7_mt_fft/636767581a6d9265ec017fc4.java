import java.util.*;

public class Generated_636767581a6d9265ec017fc4 {
    public static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Illegal factorial(n) with " + n);
        return (n <= 1)? 1 : n * factorial(n - 1);
    }
}