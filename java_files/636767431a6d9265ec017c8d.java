import java.util.*;

public class Generated_636767431a6d9265ec017c8d {
    private int computeBinaryLog(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Cannot calculate binary log for negative number: " + n);
        }
        if (n == 0) {
            return 0;
        }

        // Find the first power of 2 that is greater than or equal to n.
        int i = 1;
        while (i * 2 <= n) {
            i *= 2;
        }

        // Calculate the number of bits needed to represent n as a power of 2.
        int numberOfBits = 32 - Integer.numberOfLeadingZeros(n);

        // Subtract the number of bits we need from the number of bits we have.
        numberOfBits -= i;

        // Return the result.
        return numberOfBits;
    }
}