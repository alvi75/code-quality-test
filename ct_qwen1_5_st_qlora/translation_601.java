import java.util.*;

public class Translation601 {
    public static int getEncodedSize(Object[] values) {
    final int sizeInBytes = values.length * 2;
    for (Object value : values) {
        sizeInBytes += getSerializedSize(value);
    }
    return sizeInBytes;
}
}