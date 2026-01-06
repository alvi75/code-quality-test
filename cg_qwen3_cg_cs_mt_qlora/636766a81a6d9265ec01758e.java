import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity){
        if(desiredCapacity < 2) return 2;
        if(desiredCapacity == 2) return 2;
        if(desiredCapacity % 2 == 0) desiredCapacity++;
        for(; !isPrime(desiredCapacity); desiredCapacity += 2);
        return desiredCapacity;
    }
}