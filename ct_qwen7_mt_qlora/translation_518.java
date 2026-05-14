import java.util.*;

public class Translation518 {
    1 public static void strCpy(byte[] dst, int di, byte[] src, int si) {
    2 while (src[si] != 0) {
        3 dst[di++] = src[si++];
        4 }
        5 dst[di] = (byte) 0;
    }
}