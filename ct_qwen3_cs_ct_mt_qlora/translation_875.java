import java.util.*;

public class Translation875 {
    ublic FloatBuffer slice() {
    byteBuffer.limit(limit * SizeOf.FLOAT);
    byteBuffer.position(position * SizeOf.FLOAT);
    FloatBuffer result = new FloatToByteBufferAdapter(byteBuffer.slice()).order(byteBuffer.order());
    byteBuffer.clear();
    return result;
}
}