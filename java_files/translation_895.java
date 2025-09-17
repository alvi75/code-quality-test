import java.util.*;

public class Translationtranslation_895 {
    public int get(int index, long[] arr, int off, int len) {
        assert len > 0 : "len must be > 0 (got " + len + ")";
        assert index >= 0 && index < valueCount;
        len = Math.min(len, valueCount-index);
        System.arraycopy(arr, off, buffer, index, len);
        return len;
    }
}