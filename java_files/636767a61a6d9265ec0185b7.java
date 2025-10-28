import java.util.*;

public class Generated_636767a61a6d9265ec0185b7 {
    private static int digitValue(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        else if (c == 'a' || c == 'A') {
            return 10;
        }
        else if (c == 'b' || c == 'B') {
            return 11;
        }
        else if (c == 'c' || c == 'C') {
            return 12;
        }
        else if (c == 'd' || c == 'D') {
            return 13;
        }
        else if (c == 'e' || c == 'E') {
            return 14;
        }
        else if (c == 'f' || c == 'F') {
            return 15;
        }
        throw new IllegalArgumentException("Invalid hexadecimal digit: " + c);
    }
}