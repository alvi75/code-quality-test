import java.util.*;

public class Generated_636766f91a6d9265ec01777d {
    /**Convert an ASCII encoded character to hex.
@see #convertHexDigit(char)
@param c The ASCII character to be converted.
@return The 2 bytes of the hexadecimal representation of the input character.
*/
public static byte[] convertHexDigit(byte b) {
        if (b >= '0' && b <= '9') return new byte[]{(byte)(b - '0'), 0};
        else if (b >= 'a' && b <= 'f') return new byte[]{(byte)((b - 'a') + 10), 0};
        else if (b >= 'A' && b <= 'F') return new byte[]{(byte)((b - 'A') + 10), 0};
        else throw new IllegalArgumentException("Invalid hex digit: " + b);
    }
}