import java.util.*;

public class Generated_636767a61a6d9265ec0185b7 {
    public static int digitValue(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        } else if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        } else {
            throw new IllegalArgumentException("Invalid hexadecimal digit: " + c);
        }
    }
}