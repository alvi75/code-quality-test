import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        if (mPos >= mEnd) {
            return 0;
        }
        int b = mBuf[mPos++] & 0xFF;
        if ((b & 0x80) == 0) {
            return b;
        } else {
            int tag = b & 0x7F;
            while (((b = mBuf[mPos++]) & 0x80) != 0) {
                tag <<= 7;
                tag |= b & 0x7F;
            }
            return tag << 1 | (b >> 7);
        }
    }
}