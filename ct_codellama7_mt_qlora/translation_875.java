import java.util.*;

public class Translation875 {
    public FloatBuffer slice() {
    byteBuffer.limit(_limit * SizeOf.FLOAT);
    byteBuffer.position(_position * SizeOf.FLOAT);
    ByteBuffer bb = byteBuffer.slice().order(byteBuffer.order());
    FloatBuffer result = new FloatToByteBufferAdapter(bb);
    byteBuffer.clear();
    return result;
}
}