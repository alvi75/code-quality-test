import java.util.*;

public class Translation875 {
    ublic FloatBuffer slice() {
    byteBuffer.limit(limit * SizeOf.FLOAT);
    byteBuffer.position(position * SizeOf.FLOAT);
    ByteBuffer bb = byteBuffer.slice().order(byteBuffer.order());
    FloatToByteBufferAdapter result = new FloatToByteBufferAdapter(bb);
    byteBuffer.clear();
    return result;
}
}