import java.util.*;

public class Translation875 {
    0;
int limit = _limit * Float.BYTES;
int position = _position * Float.BYTES;
ByteBuffer bb = byteBuffer.slice().order(byteBuffer.order());
FloatBuffer result = new FloatToByteBufferAdapter(bb);
byteBuffer.clear();
return result;
}
}