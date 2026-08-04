import java.util.*;

public class Generated_636767431a6d9265ec017c8d {
    public static int computeBinaryLog(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive: " + n);
        }
        int result = 0;
        while (n > 1) {
            n >>= 1;
            result++;
        }
        return result;
    }
}