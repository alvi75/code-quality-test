import java.util.*;

public class Translation21 {
    1. public final void readBytes(byte[] b, int offset, int len, boolean useBuffer) throws IOException {
    final int available = bufferLength-bufferPosition;
    if (len<=available) {
        if(len>0) {
            System.arraycopy(buffer, bufferPosition, b, offset, len);
        }
        bufferPosition+=len;
    }
    else {
        if(available>0) {
            System.arraycopy(buffer, bufferPosition, b, offset, available);
            offset+=available;
            len-=available;
            bufferPosition+=available;
        }
        if(useBuffer&&len<bufferSize) {
            refill();
            if(len>0) {
                System.arraycopy(buffer, 0, b, offset, len);
            }
            bufferPosition=len;
        }
    }
}
}