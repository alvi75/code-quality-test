import java.util.*;

public class Translation601 {
    public static int getEncodedSize(int[] values) {
    int result = values.length * 1;
    for (int value : values) {
        result += getEncodedSize(value);
    }
    return result;
}
}