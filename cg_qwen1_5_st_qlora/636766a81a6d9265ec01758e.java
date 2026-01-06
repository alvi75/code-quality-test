import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity){
        if(desiredCapacity < 0) throw new IllegalArgumentException("desiredCapacity must be >= 0");
        if(desiredCapacity == 0) return 1;
        if(desiredCapacity <= primeCapacities.length)
            return primeCapacities[desiredCapacity];
        else{
            //find the first prime greater than or equal to desiredCapacity
            for (int i = 0; ; i++) {
                if(primeCapacities[i] > desiredCapacity)
                    return primeCapacities[i];
            }
        }
    }
}