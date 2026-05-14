import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,
                          final StringBuffer buf) {
        if (buf.length() > 0)
            buf.append('.');

        final String[] names = getNames();
        for (int i = 0; i < names.length - 1; ++i) {
            if (i != 0)
                buf.append('.');
            buf.append(names[i]);
        }
    }
}