import java.util.*;

public class Translationtranslation_106 {
    public static String toHex(String value) {
        return (value == null || value.length() == 0)? "[]": toHex(value.getBytes(LocaleUtil.CHARSET_1252));
    }
}