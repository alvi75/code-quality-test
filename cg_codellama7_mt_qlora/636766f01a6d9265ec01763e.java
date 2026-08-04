import java.util.*;

public class Generated_636766f01a6d9265ec01763e {
    public static String javaCharset(String charset) {
        if (charset == null) {
            return null;
        }
        if (charset.equalsIgnoreCase("iso-8859-1")) {
            return "ISO-8859-1";
        }
        if (charset.equalsIgnoreCase("us-ascii")) {
            return "US-ASCII";
        }
        if (charset.equalsIgnoreCase("utf-8")) {
            return "UTF-8";
        }
        if (charset.equalsIgnoreCase("utf-16")) {
            return "UTF-16";
        }
        if (charset.equalsIgnoreCase("utf-16be")) {
            return "UTF-16BE";
        }
        if (charset.equalsIgnoreCase("utf-16le")) {
            return "UTF-16LE";
        }
        if (charset.equalsIgnoreCase("utf-32")) {
            return "UTF-32";
        }
        if (charset.equalsIgnoreCase("utf-32be")) {
            return "UTF-32BE";
        }
        if (charset.equalsIgnoreCase("utf-32le")) {
            return "UTF-32LE";
        }
        return charset;
    }
}