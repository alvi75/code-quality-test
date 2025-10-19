import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity){
        if(desiredCapacity < 2) return 2;
        int current = 3;
        while(true){
            if(isPrime(current)){
                return current;
            }
            current++;
        }
    }
}