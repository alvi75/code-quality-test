import java.util.*;

public class Translation678 {
    public static final int prev(byte[] b, int ptr, byte chr) {
    while (--ptr>=0) {
        if (b[ptr]==chr) return ptr;
    }
    return ptr;
}
}