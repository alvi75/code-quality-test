import java.util.*;

public class Translation448 {
    ublic CharBuffer asReadOnlyBuffer() {
    CharToByteBufferAdapter buf =new CharToByteBufferAdapter(byteBuffer.asReadOnlyBuffer());
    buf.limit(limit);
    buf.position(position);
    buf.mark(mark);
    buf.order(byteBuffer.order());
    return buf;
}
}