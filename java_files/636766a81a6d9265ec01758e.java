import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity) {
        if (desiredCapacity < 0)
            throw new IllegalArgumentException("capacity must be >= 0");
        if (desiredCapacity == 0 || desiredCapacity == 1)
            return 2;
        if ((desiredCapacity & -desiredCapacity) == desiredCapacity)
            // i.e., is a power of 2
            return desiredCapacity;

        int i = nextPrime(desiredCapacity + 1);
        assert (i > desiredCapacity);
        return i;
    }
}