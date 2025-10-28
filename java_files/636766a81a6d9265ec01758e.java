import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity) {
        if (desiredCapacity < 2)
            throw new IllegalArgumentException("The capacity must be greater than or equal to 2.");
        int current = 2;
        while (current < desiredCapacity) {
            current++;
            if (isPrime(current))
                continue;
        }
        return current;
    }
}