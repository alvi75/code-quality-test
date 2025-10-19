import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    /**Returns the element at the location specified by desiredCapacity in primeCapacities.
@see #nextPrime(int)
*/
public static int nextPrime(int desiredCapacity) {
        if (desiredCapacity < 0 || desiredCapacity > MAX_CAPACITY) {
            throw new IllegalArgumentException("capacity must be >= 0 && <= " + MAX_CAPACITY);
        }
        return primeCapacities[findIndex(desiredCapacity)];
    }
}