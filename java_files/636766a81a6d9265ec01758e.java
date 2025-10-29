import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    /**Returns the element at the location specified by desiredCapacity in primeCapacities.**/
    public static int nextPrime(int desiredCapacity) {
        if (desiredCapacity < 2) {
            throw new IllegalArgumentException("The capacity must be greater than or equal to 2.");
        }
        int i = desiredCapacity;
        while (!isPrime(i)) {
            ++i;
        }
        return i;
    }
}