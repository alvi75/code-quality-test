import java.util.*;

public class Generated_636767a41a6d9265ec01857e {
    private static int compareSigned(long a, long b) {
        if (a < 0 && Long.MAX_VALUE - a > b)
            return -1;
        else if (b >= 0 && Long.MAX_VALUE - b > a)
            return 1;

        // This is the case where both values are within range of each other.
        return (int)(a-b);
    }
}