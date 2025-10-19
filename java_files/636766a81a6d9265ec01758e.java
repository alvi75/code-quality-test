import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity){
        if(desiredCapacity < 2)
            return 2;
        for (int i = 3; i <= desiredCapacity; i += 2) {
            if(isPrime(i))
                return i;
        }
        return -1;
    }
}