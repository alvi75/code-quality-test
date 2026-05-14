import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity){
        if (desiredCapacity <= 1) {
            return 2;
        }
        for (int i = 0; i < PRIMES.length; i++) {
            if (PRIMES[i] > desiredCapacity) {
                return PRIMES[i];
            }
        }

        //if we get here, then the array is full of primes but still not large enough.
        //so just double it until it's big enough.
        int size = PRIMES[PRIMES.length - 1];
        while(size < desiredCapacity){
            size *= 2;
        }
        return size;
    }
}