import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity){
        if(desiredCapacity < 2) return 2;
        for(int i = desiredCapacity; i <= Integer.MAX_VALUE; i++){
            if(isPrime(i)) return i;
        }
        throw new RuntimeException("Unable to find a prime number greater than " + desiredCapacity);
    }
}