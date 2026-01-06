import java.util.*;

public class Translation875 {
    public FloatBuffer slice() {
    byteBuffer.limit(limit * SizeOf.FLOAT);
    byteBuffer.position(position * SizeOf.FLOAT);
    ByteBuffer bb = byteBuffer.slice().order(ByteBufferOrdering.nativeOrder());
    FloatBuffer result = new FloatToByteBufferAdapter(bb);
    byteBuffer.clear();
    return result;
}
}