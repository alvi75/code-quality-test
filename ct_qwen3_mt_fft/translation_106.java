import java.util.*;

public class Translation106 {
    public static String toHex(int value) {
    StringBuilder sb = new StringBuilder(8);
    writeHex(sb, value & 0xFFFFFFFFL, 8, "");
    return sb.toString();
}
}