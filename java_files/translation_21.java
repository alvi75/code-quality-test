import java.util.*;

public class Translation21 {
    public final void readBytes(byte[] b, int offset, int len, boolean useBuffer) throws IOException {
    final int available = bufferLength - bufferPosition;
    if (len <= available) {
        if (len > 0) {
            System.arraycopy(buffer, bufferPosition, b, offset, len);
        }
        bufferPosition += len;
    }
    else {
        if (available > 0) {
            System.arraycopy(buffer, bufferPosition, b, offset, available);
            offset += available;
            len -= available;
            bufferPosition += available;
        }
        if (useBuffer && len > 0) {
            Refill();
            if (bufferLength < len) {
                System.arraycopy(buffer, 0, b, offset, bufferLength);
                throw new EOFException("read past EOF: " + this);
            }
            else {
                System.arraycopy(buffer, 0, b, offset, len);
                bufferPosition = len;
            }
        }
    }
}