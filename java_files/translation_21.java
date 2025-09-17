import java.util.*;

public class Translationtranslation_21 {
    public final void readBytes(byte[] b, int offset, int len, boolean useBuffer) throws IOException {
        final int available = bufferLength-bufferPosition;
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
            if (useBuffer && len < bufferSize) {
                refill();
            }
            else if (useBuffer && len >= bufferSize) {
                final long after = bufferStart + bufferPosition + len;
                if (after > size()) {
                    throw new EOFException("read past EOF");
                }
                readInternal(b, offset, len);
                bufferStart = after;
                bufferPosition = 0;
                bufferLength = 0;
            }
        }
        else {
            final long after = bufferStart + bufferPosition + len;
            if (after > size()) {
                throw new EOFException("read past EOF");
            }
            readInternal(b, offset, len);
            bufferStart = after;
            bufferPosition = 0;
            bufferLength = 0;
        }
    }
    }
}