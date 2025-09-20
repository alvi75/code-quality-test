import java.util.*;

public class Translation566 {
    public BytesRef getPayload(BytesRef bytes) {
    if (payloadEncoder == null) {
        return null;
    }
    int payloadLength = payloadEncoder.decode(bytes);
    if (payloadLength < 0) {
        return null;
    }
    bytes = copyOfRange(bytes, payloadEncoder.offset + payloadLength, bytes.length);
    return payloadEncoder.decode(payloadLength);
}
}