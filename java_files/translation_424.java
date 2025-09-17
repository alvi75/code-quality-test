import java.util.*;

public class Translationtranslation_424 {
    public float get(int index) {
        checkIndex(index);
        return byteBuffer.getFloat(index * SizeOf.FLOAT);
    }
}