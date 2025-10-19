import java.util.*;

public class Generated_636766f01a6d9265ec01763e {
    /**Translate a MIME standard charset name into the Java equivalent.**/
    private static String javaCharset(String charset) {
        if (charset == null)
            return null;
        else if ("7bit".equals(charset))
            return "US-ASCII";
        else if ("8bit".equals(charset))
            return "ISO-8859-1";
        else if ("binary".equals(charset))
            return "US-ASCII";
        else if ("quoted-printable".equals(charset))
            return "US-ASCII";
        else if ("base64".equals(charset))
            return "US-ASCII";
        else if ("utf-8".equals(charset))
            return "UTF-8";
        else if ("utf-16".equals(charset))
            return "UTF-16BE";
        else if ("utf-32".equals(charset))
            return "UTF-32BE";
        else
            return charset;
    }
}