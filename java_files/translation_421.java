import java.util.*;

public class Translation421 {
    public static byte[] getToUnicodeLE(String string1) {
    return new Utf8Bytes(getBytesLE(string1));
}
}