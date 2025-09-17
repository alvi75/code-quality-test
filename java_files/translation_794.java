import java.util.*;

public class Translationtranslation_794 {
    public int stem(char s[], int len) {
        if (len > 4 && s[len-1] == 's') len--;
        if (len > 5 && (endsWith(s, len, "ene")|| (endsWith(s, len, "ane") && useNynorsk))) return len - 3;
        if (len > 4 && (endsWith(s, len, "er")|| endsWith(s, len, "en")|| endsWith(s, len, "et")|| (endsWith(s, len, "ar") && useNynorsk))) return len - 2;
        if (len > 3) {
            switch(s[len-1]) {
                case 'a':case 'e': return len - 1;
            }
        }
        return len;
    }
}