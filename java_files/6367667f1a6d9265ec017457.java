import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
        if (i < 0 || i >= bb.limit()) {
            throw new IllegalArgumentException("Invalid byte position: " + i);
        }
        int len = bb.getInt(i);
        for (int j = 0; j < len; ++j) {
            char c = (char)bb.get();
            if (c == '\uFFFF') {
                throw new IllegalArgumentException("UTF-16 surrogate");
            }
            sb.append(c);
        }
        return i + len;
    }
}