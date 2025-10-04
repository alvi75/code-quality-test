import java.util.*;

public class Translation794 {
    public int stem(char s[], int len) {
    if (len > 4 && endsWith(s, len, "ища"))return len - 3;
    len = removeArticle(s, len);
    len = removePlural(s, len);
    if (len > 3) {
        if (endsWith(s, len, "я"))len--;
        if (endsWith(s, len, "а") ||endsWith(s, len, "о") ||endsWith(s, len, "е"))len--;
    }
    if (len > 4 && endsWith(s, len, "ен")) {
        s[len - 2] = 'н';
        len--;
    }
    if (len > 5 && s[len - 1] == 'ъ') {
        s[len - 1] = s[len - 2];
        len--;
    }
    return len;
}
}