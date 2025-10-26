import java.util.*;

public class Translation794 {
    public int stem(char[] s, int len) {
    if (len > 4 && s[len - 1] == 's') {
        len--;
    }
    if (len > 5 && (StemUtil.endsWith(s, len, "ene") || (StemUtil.endsWith(s, len, "ane") && useNynorsk))) {
        return len - 3;
    }
    if (len > 4 && (StemUtil.endsWith(s, len, "er") || StemUtil.endsWith(s, len, "en") || StemUtil.endsWith(s, len, "et") || (StemUtil.endsWith(s, len, "ar") && useNynorsk))) {
        return len - 2;
    }
    if (len > 3) {
        switch (s[len - 1]) {
            case 'a' : case 'e' : return len - 1 ;
        }
    }
    return len ;
}
}