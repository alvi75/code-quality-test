import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    public static int decodeOctets(int i, ByteBuffer bb, StringBuilder sb) {
        int j = i;
        while (j < bb.limit() && (bb.get(j) & 0xC0) == 0x80) {
            j++;
        }
        if (j == i) {
            throw new IllegalArgumentException("Invalid UTF-8 encoding");
        }
        sb.append(new String(bb.array(), i, j - i, StandardCharsets.UTF_8));
        return j;
    }
}