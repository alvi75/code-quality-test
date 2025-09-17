import java.util.*;

public class Translationtranslation_601 {
    public static int getEncodedSize(Object[] values) {
        int result = values.length * 1;
        for (Object value : values) {
            result += getEncodedSize(value);
        }
        return result;
    }
}