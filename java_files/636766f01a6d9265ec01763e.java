import java.util.*;

public class Generated_636766f01a6d9265ec01763e {
    /**Translate a MIME standard charset name into the Java equivalent.**/
private static String javaCharset(String charset){
        if(charset==null) return null;
        if(charset.equals("ISO-8859-1")) return "ISO8859_1";
        if(charset.equals("UTF-8")) return "UTF8";
        if(charset.equals("US-ASCII")) return "US_ASCII";
        if(charset.equals("UTF-16")) return "UTF16";
        if(charset.equals("UTF-16BE")) return "UTF16BE";
        if(charset.equals("UTF-16LE")) return "UTF16LE";
        if(charset.equals("UTF-32")) return "UTF32";
        if(charset.equals("UTF-32BE")) return "UTF32BE";
        if(charset.equals("UTF-32LE")) return "UTF32LE";
        return charset;
    }
}