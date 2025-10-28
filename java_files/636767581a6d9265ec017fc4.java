import java.util.*;

public class Generated_636767581a6d9265ec017fc4 {
    public static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        else if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}