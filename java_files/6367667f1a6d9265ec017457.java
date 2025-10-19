import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
        int j = bb.position();
        while (i > 0) {
            if ((i & 0x3f) == 0) { // 1 to 2 bytes
                sb.append((char)(bb.get() & 0xff));
                i -= 1;
            } else if ((i & 0xc0) == 0x30) { // 2 to 4 bytes
                sb.append((char)((bb.get() & 0xff) << 6 | (bb.get() & 0x3f)));
                i -= 2;
            } else if ((i & 0xe0) == 0xc0) { // 4 to 8 bytes
                sb.append((char)((bb.get() & 0xff) << 12 | (bb.get() & 0x3f) << 6 | (bb.get() & 0x3f)));
                i -= 3;
            } else if ((i & 0xf0) == 0xe0) { // 8 to 16 bytes
                sb.append((char)((bb.get() & 0xff) << 18 | (bb.get() & 0x3f) << 12 | (bb.get() & 0x3f) << 6 | (bb.get() & 0x3f)));
                i -= 4;
            } else if ((i & 0xf8) == 0xf0) { // 16 to 24 bytes
                sb.append((char)((bb.get() & 0xff) << 24 | (bb.get() & 0x3f) << 18 | (bb.get() & 0x3f) << 6 | (bb.get() & 0x3f) << 0));
                i -= 5;
            }
        }
        bb.position(j);
        return i;
    }
}