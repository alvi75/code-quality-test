import java.util.*;

public class Translation518 {
    1 public static void strcpy(char[] dst, int di, char[] src, int si) {
    while (src[si] != 0) {
        dst[di++] = src[si++];
    }
    dst[di] = 0;
}
}