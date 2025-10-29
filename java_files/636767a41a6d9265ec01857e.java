import java.util.*;

public class Generated_636767a41a6d9265ec01857e {
    /**Compare two numbers.**/
    private static int compareSigned(long a, long b) {
        if (a < 0 && b >= 0) {
            return -1;
        } else if (b < 0 && a >= 0) {
            return 1;
        }
        return Long.compare(a, b);
    }
}