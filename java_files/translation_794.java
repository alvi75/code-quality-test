import java.util.*;

public class Translation794 {
    public int stem(char[] s, int len) {
    if (len > 4 && s[len-1]=='s') {
        len--;
    }
    if (len > 5 && (stemmerUtil.endsWith(s,len,"ene") || (stemmerUtil.endsWith(s,len,"ane") && useNynorsk))) {
        return len-3;
    }
    if (len > 4 && (stemmerUtil.endsWith(s,len,"er") || stemmerUtil.endsWith(s,len,"en") || stemmerUtil.endsWith(s,len,"et") || (stemmerUtil.endsWith(s,len,"ar") && useNynorsk)))) {
        return len-2;
    }
    if (len > 3) {
        switch (s[len-1]) {
            case 'a': case 'e': return len-1;
        }
    }
}
return len;
}
}