import java.util.*;

public class Translation448 {
    01 public CharBuffer asReadOnlyBuffer() {
    CharToByteBufferAdapter buf = new CharToByteBufferAdapter(byteBuffer.asReadOnlyBuffer());
    buf.limit = limit;
    buf.position = position;
    buf.mark = mark;
    byteBuffer.order = order;
    return buf;
}
}