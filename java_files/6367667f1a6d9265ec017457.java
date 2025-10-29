import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    public static int DecodeOctets(int i,ByteBuffer bb,StringBuilder sb){
        int c = bb.get();
        if (c == 0x00) {
            return -1;
        }
        for (; i < 4; ++i) {
            c = bb.get();
            if (c == 0x00) {
                break;
            }
            sb.append((char)c);
        }
        return i;
    }
}