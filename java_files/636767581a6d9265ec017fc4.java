import java.util.*;

public class Generated_636767581a6d9265ec017fc4 {
    /**Calculate the factorial of the given number.
@param n The number to calculate the factorial for.
@return The factorial of the given number.
@throws IllegalArgumentException If the number is negative.
*/
public static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial not defined for negative numbers.");
        else if (n == 0 || n == 1)
            return 1;
        else {
            long result = 1;
            for (int i = 2; i <= n; ++i)
                result *= i;
            return result;
        }
    }
}