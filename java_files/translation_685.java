import java.util.*;

public class Translationtranslation_685 {
    public static final int trimTrailingWhitespace(byte[] raw, int start, int end) {
        if (start < 0 || end > raw.length || start > end)throw new ArrayIndexOutOfBoundsException("start < 0 || end > raw.length|| start > end");
        int ptr = end - 1;
        while (start < ptr && isWhitespace(raw[ptr]))ptr--;
        return ptr + 1;
    }
}