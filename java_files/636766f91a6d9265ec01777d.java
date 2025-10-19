import java.util.*;

public class Generated_636766f91a6d9265ec01777d {
    /**
 * Convert an ASCII encoded character to hex.
 */
public static byte convertHexDigit(byte b) {
    if (b >= '0' && b <= '9') return (byte)(b - '0');
    if (b >= 'a' && b <= 'f') return (byte)((b - 'a') + 10);
    if (b >= 'A' && b <= 'F') return (byte)((b - 'A') + 10);
    throw new IllegalArgumentException("Invalid hex digit: " + b);
  }
}