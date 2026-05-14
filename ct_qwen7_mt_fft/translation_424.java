import java.util.*;

public class Translation424 {
    public float get(int index) {
    checkIndex(index);
    return byteBuffer.getFloat(index * SizeOf.FLOAT);
}
}