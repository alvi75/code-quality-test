import java.util.*;

public class Generated_636766f01a6d9265ec01763e {
    /**Translate a MIME standard charset name into the Java equivalent.**/
private static String javaCharset(String charset) {
        if (charset == null || charset.length() == 0)
            return "ISO-8859-1";
        else if (charset.equals("UTF-8"))
            return "UTF-8";
        else if (charset.equals("UTF-16BE")) {
            return "UTF-16BE";
        } else if (charset.equals("UTF-16LE")) {
            return "UTF-16LE";
        } else if (charset.equals("UTF-32BE")) {
            return "UTF-32BE";
        } else if (charset.equals("UTF-32LE")) {
            return "UTF-32LE";
        }
        else if (charset.equals("US-ASCII")) {
            return "US-ASCII";
        }
        else if (charset.equals("ISO-8859-1")) {
            return "ISO-8859-1";
        }
        else if (charset.equals("EUC-JP")) {
            return "EUC-JP";
        }
        else if (charset.equals("EUC-KR")) {
            return "EUC-KR";
        }
        else if (charset.equals("GB2312")) {
            return "GB2312";
        }
        else if (charset.equals("GBK")) {
            return "GBK";
        }
        else if (charset.equals("BIG5")) {
            return "BIG5";
        }
        else if (charset.equals("CP850")) {
            return "CP850";
        }
        else if (charset.equals("CP866")) {
            return "CP866";
        }
        else if (charset.equals("CP852")) {
            return "CP852";
        }
        else if (charset.equals("CP864")) {
            return "CP864";
        }
        else if (charset.equals("CP853")) {
            return "CP853";
        }
        else if (charset.equals("CP857")) {
            return "CP857";
        }
        else if (charset.equals("CP851")) {
            return "CP851";
        }
        else if (charset.equals("CP852")) {
            return "CP852";
        }
        else if (charset.equals
}