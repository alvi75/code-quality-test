import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity){
        if(desiredCapacity < 2) return 2;
        else if(desiredCapacity % 2 == 0) desiredCapacity++;
        for(int i = 3; i <= Math.sqrt(desiredCapacity); i += 2)
            if((desiredCapacity & (i - 1)) != 0) return desiredCapacity;
        return desiredCapacity + 2;
    }
}