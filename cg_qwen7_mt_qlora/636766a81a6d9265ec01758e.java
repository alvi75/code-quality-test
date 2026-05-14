import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity){
        if (desiredCapacity < 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
        // Find a power of two >= desiredCapacity
        int capacity = Integer.highestOneBit(desiredCapacity - 1);
        return capacity == desiredCapacity ? capacity : capacity << 1;
    }
}