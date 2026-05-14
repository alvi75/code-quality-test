import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity) {
        if (desiredCapacity == 1) return 2;
        else if (desiredCapacity < 3) return 3;

        // ensure that the capacity has to be a prime number.
        int cap = Math.max(desiredCapacity, 3);

        while (!isPrime(cap)) cap += 2;

        return cap;
    }
}