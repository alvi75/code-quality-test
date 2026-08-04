import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    public static String parseToken(char[] terminators) {
        int start = pos;
        while (pos < len && !Arrays.binarySearch(terminators, data[pos]) >= 0) {
            pos++;
        }
        return new String(data, start, pos - start);
    }
}