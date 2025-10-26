import java.util.*;

public class Translation875 {
    public FloatBuffer slice() {
    byteBuffer.limit(limit * SIZEOF_FLOAT);
    byteBuffer.position(position * SIZEOF_FLOAT);
    ByteBuffer bb = byteBuffer.slice().order(byteBuffer.order());
    FloatBuffer result = new FloatToByteBufferAdapter(bb);
    byteBuffer.clear();
    return result;
}
}