import java.util.*;

public class Generated_636767a61a6d9265ec0185b7 {
    private static int digitValue(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        switch(c) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                throw new IllegalArgumentException("The string contains a non hex character");
        }
    }
}