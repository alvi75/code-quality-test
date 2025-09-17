import java.util.*;

public class Translationtranslation_21 {
    public final void readBytes(byte[] b, int offset, int len, boolean useBuffer) {
        int available = bufferLength-bufferPosition;
        if (len<=available) {
            if (len>0) {
                System.arraycopy(buffer, bufferPosition,b, offset, len);
            }
            bufferPosition+=len;
        }
        else {
            if (available>0) {
                System.arraycopy(buffer, bufferPosition,b, offset, available);
                offset+=available;
                len-=available;
                bufferPosition+=available;
            }
            if (useBuffer && len < bufferSize) {
                refill();
                if (bufferLength < len) {
                    System.arraycopy(buffer, 0, b, offset, bufferLength);
                    throw new EOFException("read past EOF");
                }
                else {
                    System.arraycopy(buffer, 0, b, offset, len);
                    bufferPosition = len;
                }
            }
            else {
                long after = bufferStart+bufferPosition+len;
                if (after > length()) {
                    throw new EOFException("read past EOF");
                }
                read(b, offset, len);
                bufferStart = after;
                bufferPosition = 0;
                bufferLength = 0;
            }
        }
    }
}