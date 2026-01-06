import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        int tag = 0;
        if (this.pos >= this.limit) {
            return 0;
        }
        tag = (this.buf[this.pos++] & 0xff);
        if ((tag & 0x80) == 0) {
            return tag;
        }
        tag &= 0x7f;
        for (int i = 0; i < TAG_TYPE_BITS; i++) {
            tag <<= 1;
            tag |= (this.buf[this.pos++] & 0x01);
        }
        return tag;
    }
}