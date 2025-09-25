import java.util.*;

public class Translation424 {
    public final float get(int index) {
    checkIndex(index);
    return byteBuffer.getFloat(index * SizeOf.FLOAT);
}
}