import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    public static int computeUTF8Size(final CharSequence str, final int index, final int len) {
        if (str instanceof AsciiString)
            return ((AsciiString) str).computeUTF8Size(index, len);
        else
            return Utf8.computeEncodedLength(str.subSequence(index, index + len));
    }
}