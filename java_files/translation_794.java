import java.util.*;

public class Translationtranslation_794 {
    public int stem(char s[], int len) {
        if (len > 4 && endsWith(s, len, "s"))len--;
        if (len > 5 && endsWith(s, len, "ine") ||endsWith(s, len, "ane")&& (flags & END_STEMMER) != 0))len = len - 3;
        if (len > 4 && endsWith(s, len, "er")||endsWith(s, len, "en")||endsWith(s, len, "et")||endsWith(s, len, "ar")&& (flags & END_STEMMER) != 0))len = len - 2;
        return len;
    }
}