import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf) {
        if (nameStart < 0 || nameStart >= m_name.length()) return;
        final String name = m_name.substring(nameStart);
        final int len = name.length();
        if (len == 0) return;

        // Find the longest common prefix of all substrings.
        int i = 1;
        while (i < len && name.charAt(i - 1) == '.') {
            for (int j = i; j < len; ++j)
                if (name.charAt(j) != name.charAt(j - 1)) break;
            if (j == len) break;
            ++i;
        }

        // Abbreviate the name.
        if (i > 0) {
            buf.append('.');
            buf.append(name.substring(0, i));
        }
    }
}