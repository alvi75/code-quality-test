import java.util.*;

public class Translation424 {
    1 public final float get(int index) {
    2 checkIndex(index);
    3 return byteBuffer.getFloat(index * SizeOf.FLOAT);
}
}