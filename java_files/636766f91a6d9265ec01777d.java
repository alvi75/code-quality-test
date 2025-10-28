import java.util.*;

public class Generated_636766f91a6d9265ec01777d {
    public static byte convertHexDigit(byte b) {
        if (b >= '0' && b <= '9') return (byte) b;
        else if (b >= 'a' && b <= 'f') return (byte) (b - 10);
        else if (b >= 'A' && b <= 'F') return (byte) (b - 10);
        else throw new IllegalArgumentException("Invalid hex digit: " + b);
    }
}