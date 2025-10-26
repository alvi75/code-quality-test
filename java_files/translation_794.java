import java.util.*;

public class Translation794 {
    ublic override int Stem(char[] s, int len){
    if (len > 4 && s[len - 1] == 's'){
        len--;
    }
    if (len > 5 && ((StemmerUtil.EndsWith(s, len, "ene") || (StemmerUtil.EndsWith(s, len, "ane") && useNynorsk))){
        return len - 3;
    }
    if (len > 4 && (StemmerUtil.EndsWith(s, len, "er") || StemmerUtil.EndsWith(s, len, "en") || StemmerUtil.EndsWith(s, len, "et") || (StemmerUtil.EndsWith(s, len, "ar") && useNynorsk))) {
        return len - 2;
    }
    if (len > 3){
        switch (s[len - 1]){
            case 'a': case 'e': return len - 1;
        }
    }
    return len;
}
}