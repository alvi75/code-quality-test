import java.util.*;

public class Translation844 {
    public static final int parseHexInt4(int c) {
    final int result;
    if (c >= 'a' && c <= 'f')result = ((c - 'a') + 10) << 2;
    else if (c >= 'A' && c <= 'F')result = ((c - 'A') + 10) << 2;
    else if (c >= '0' && c <= '9')result = (c - '0') << 2;
    else throw new IllegalArgumentException("Invalid hex character '" + (char)c + "'");
    return result;
}
}