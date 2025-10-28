import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf) {
        if (nameStart < 0 || nameStart >= m_name.length()) return;
        final String[] names = m_name.split("\\.");
        for (int i = 0; i < names.length && i < m_abbreviateCount; i++) {
            buf.append(names[i]);
            if (i != names.length - 1) buf.append('.');
        }
    }
}