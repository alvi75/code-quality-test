import java.util.*;

public class Translation106 {
    ublic static String toHex(String value) {
    return (value == null || value.length() == 0)? "[]": toHex(value.getBytes(LocaleUtil.CHARSET_1252));
}
}