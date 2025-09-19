import java.util.*;

public class Translation794 {
    public int stem(char s[], int len) {
    if (len > 4 && endsWith(s, len, "s"))len--;
    if (len > 5 && endsWith(s, len, "ene")|| (len > 4 && startsWith(s, len, "en")))len = len - 3;
    if (len > 4 && endsWith(s, len, "er")|| (len > 3 && startsWith(s, len, "ar")))len = len - 2;
    return len;
}
}