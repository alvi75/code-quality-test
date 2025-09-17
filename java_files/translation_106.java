import java.util.*;

public class Translationtranslation_106 {
    public static String toHex(long value) {
        StringBuilder sb = new StringBuilder(16);
        writeHex(sb, value, 16, "");
        return sb.toString();
    }
}