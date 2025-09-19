import java.util.*;

public class Translation421 {
    public static byte[] getToUnicodeLE(String string) {
    return toUTF16LE(string.getBytes(ISO_8859_1));
}
}