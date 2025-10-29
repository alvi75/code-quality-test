import java.util.*;

public class Translation601 {
    ublic static int getEncodedSize(Object[] values) {
    int result = values.length * 1;
    for (int i = 0;
    i < values.length;
    i++) {
        result += getEncodedSize(values[i]);
    }
    return result;
}
}