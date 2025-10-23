import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity){
        if(desiredCapacity < 16) return 16;
        for(int i = 0; i < primeCapacities.length; i++){
            if(primeCapacities[i] >= desiredCapacity)
                return primeCapacities[i];
        }
        return -1;
    }
}