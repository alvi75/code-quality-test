import java.util.*;

public class Translation601 {
    public static final int getEncodedSize(Object[] values) {
    int size = 0;
    for (Object value : values)size += getEncodedSize(value);
    return size;
}
}