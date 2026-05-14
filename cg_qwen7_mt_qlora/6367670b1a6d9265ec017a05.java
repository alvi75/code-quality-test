import java.util.*;

public class Generated_6367670b1a6d9265ec017a05 {
    public static String toString(final char ch){
        if (ch < 128) {
            return CHARS[ch];
        }
        final StringBuilder sb = new StringBuilder(4);
        append(sb, ch);
        return sb.toString();
    }
}