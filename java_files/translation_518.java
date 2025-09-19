import java.util.*;

public class Translation518 {
    public static void strCpy(char[] dst, int dstOff, char[] src, int srcOff,int srcLen) {
    for (int i = 0;
    i < srcLen;
    i++) {
        dst[dstOff + i] = src[srcOff + i];
    }
    dst[dstOff + srcLen] = 0;
}
}