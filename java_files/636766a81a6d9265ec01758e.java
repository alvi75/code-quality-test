import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    /**Returns the element at the location specified by desiredCapacity in primeCapacities.*/
    public static int nextPrime(int desiredCapacity) {
        if (desiredCapacity < 3)
            return 2;
        if (desiredCapacity <= MAXIMUM_CAPACITY && (primeCapacities[desiredCapacity] != 0))
            return primeCapacities[desiredCapacity];
        int index = Arrays.binarySearch(primeCapacities, desiredCapacity);
        if (index < 0)
            index = -index - 1;
        return primeCapacities[index];
    }
}