import java.util.*;

public class Generated_636767431a6d9265ec017c8d {
    private int computeBinaryLog(int n) {
        if (n < 0)
            throw new IllegalArgumentException("The number " + n + " is not positive.");

        final int log = Integer.numberOfTrailingZeros(n);
        return log;
    }
}