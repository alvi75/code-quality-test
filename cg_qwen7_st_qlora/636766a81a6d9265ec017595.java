import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2){
        if (this.buf.length - this.len < 2) {
            enlarge(2);
        }
        final byte[] buf = this.buf;
        buf[this.len++] = (byte)byteValue1;
        buf[this.len++] = (byte)byteValue2;
        return this;
    }
}