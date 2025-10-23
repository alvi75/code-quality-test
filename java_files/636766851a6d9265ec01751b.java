import java.util.*;

public class Generated_636766851a6d9265ec01751b {
    /**Convert a hexadecimal number to binary and return its character type.**/
private static char decodeHexNibble(final char c){
        if(c >= '0' && c <= '9') {
            return (char) ((c - '0') << 4);
        } else if(c >= 'A' && c <= 'F') {
            return (char) ((c - 'A' + 10) << 4);
        } else if(c >= 'a' && c <= 'f') {
            return (char) ((c - 'a' + 10) << 4);
        }
        throw new IllegalArgumentException("Invalid hex digit: " + c);
    }
}