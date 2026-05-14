import java.util.*;

public class Translation717 {
    public static int idealByteArraySize(int need) {
    int sz = 4;
    while (sz < need) {
        sz <<= 1;
    }
    return sz;
}
}