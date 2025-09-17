import java.util.*;

public class Translationtranslation_844 {
    public static int parseHexInt4(byte[] b, int ptr) {
        int v = parseHexInt2(b, ptr);
        if (v >= 0x80) {
            v -= 0xc0;
        }
        return v;
    }
}