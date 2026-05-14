import java.util.*;

public class Generated_636766f01a6d9265ec01763e {
    private static String javaCharset(String charset) {
        if (charset == null)
            return null;
        // First try the canonical form.
        String java = _canonicalName.get(charset);
        if (java != null)
            return java;

        // Otherwise, search for it in the equivalency table.
        int i = Charsets.findJavaCharset(charset);
        if (i > 0)
            return Charsets._equivalencies[i];
        else
            return null;
    }
}