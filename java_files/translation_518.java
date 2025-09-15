import java.util.*;

public class Translationtranslation_518 {
    public static void strcpy(char[] dst, int dstStart, char[] src, int srcStart) {
        while (src[srcStart] != 0) {
            dst[dstStart++] = src[srcStart++];
        }
        dst[dstStart++] = 0;
    }
}