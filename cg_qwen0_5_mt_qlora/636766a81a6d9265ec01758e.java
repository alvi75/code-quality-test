import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    /**Returns the element at the location specified by desiredCapacity in primeCapacities.**/
    public static int nextPrime(int desiredCapacity){
        if(desiredCapacity < 2) return 2;
        while(true){
            if(isPrime(desiredCapacity)) break;
            desiredCapacity++;
        }
        return desiredCapacity;
    }
}