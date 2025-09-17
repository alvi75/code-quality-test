import java.util.*;

public class Translationtranslation_875 {
    public FloatBuffer slice() {
        byteBuffer.limit(limit * SizeOf.FLOAT);
        byteBuffer.position(position * SizeOf.FLOAT);
        ByteBuffer bb = byteBuffer.slice().order(byteBuffer.order());
        FloatBuffer result = new FloatToByteBufferAdapter(bb);
        byteBuffer.clear();
        return result;
    }
}