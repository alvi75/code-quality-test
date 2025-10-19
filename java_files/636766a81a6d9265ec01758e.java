import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    /**
 * Returns the element at the location specified by desiredCapacity in primeCapacities.
 */
public static int nextPrime(int desiredCapacity) {
        if (desiredCapacity < 2) {
            return 2;
        }
        for (int i = 0; i < primeCapacities.length; i++) {
            if (primeCapacities[i] >= desiredCapacity) {
                return primeCapacities[i];
            }
        }
        throw new IllegalArgumentException("Unable to find a prime number greater than " + desiredCapacity);
    }
}