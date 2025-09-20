import java.util.*;

public class Translation106 {
    public static String toHex(long value) {
    StringBuilder sb = new StringBuilder(16);
    writeHex(sb, value & 0xFFFFFFFFL, 8, "");
    return sb.toString();
}
}