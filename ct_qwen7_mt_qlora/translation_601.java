import java.util.*;

public class Translation601 {
    245 public static int getEncodedSize(Object[] values) {
    final int len = values.length;
    int result = len * 1;
    for (int i = 0;
    i < len;
    i++) {
        result += getEncodedSize(values[i]);
    }
    return result;
}
}