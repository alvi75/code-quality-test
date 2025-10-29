import java.util.*;

public class Translation424 {
    @Override public float get(int index) {
    checkIndex(index);
    return byteBuffer.getFloat(index * SizeOf.FLOAT);
}
}