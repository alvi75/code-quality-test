import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity) {
        if (desiredCapacity < 0)
            throw new IllegalArgumentException();
        
        // Find first candidate that is a power of two.
        int n = 1;
        while(n < desiredCapacity){
            n <<= 1;
        }
        
        // Use the found number as a starting point for Knuth's multiplicative method.
        long p = 3; 
        long f = DESIRED_CAPACITY_FRACTION;
        while(p < n) {
            long t = p;
            while(t <= n) {
                if ((t & 1) == 0) {
                    t <<= 1;
                } else {
                    t += n;
                }
                
                if (((t * f) & 0x7FFFFFFF) == 0) {
                    return (int)t;
                }
            }
            
            p = t;
        }
        
        // We have exceeded the ceiling, so we need to go bigger than the last candidate.
        return n;
    }
}