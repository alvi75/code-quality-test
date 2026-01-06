import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity){
        if(desiredCapacity < 2) {
            throw new IllegalArgumentException("The capacity must be greater than or equal to 2.");
        }
        for (int i = 3; i * i <= desiredCapacity; i += 2) {
            if(isPrime(i)) {
                return i;
            }
        }
        //if we made it here, then no primes were found.
        throw new IllegalArgumentException("Could not find a prime number larger than " + desiredCapacity);
    }
}