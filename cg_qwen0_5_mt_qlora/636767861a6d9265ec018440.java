import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
        final int len = buf.length();
        if (len == 0) return;
        int i = nameStart;
        while (i < len && buf.charAt(i) != '.') {
            ++i;
        }
        if (i == len) return;
        for (; i < len; ++i) {
            buf.setCharAt(len - i, buf.charAt(i));
        }
    }
}