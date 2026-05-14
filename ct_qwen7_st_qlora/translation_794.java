import java.util.*;

public class Translation794 {
    public int stem(char s[], int len) {
    if (len > 4 && s[len-1] == 's')len--;
    if (len > 5 && endsWith(s, len, "ene"))len -= 3;
    if (len > 4 && endsWith(s, len, "er"))len -= 2;
    if (len > 4 && endsWith(s, len, "en"))len -= 2;
    if (len > 4 && endsWith(s, len, "et"))len -= 2;
    if (len > 3 && endsWith(s, len, "ar"))len -= 2;
    if (len > 3)s[len++] = 'e';
    if (len > 4 && s[len-1] == 's')len--;
    if (len > 5 && endsWith(s, len, "ene"))len -= 3;
    if (len > 4 && endsWith(s, len, "er"))len -= 2;
    if (len > 4 && endsWith(s, len, "en"))len -= 2;
    if (len > 4 && endsWith(s, len, "et"))len -= 2;
    if (len > 3 && s[len-1] == 'a')len--;
    if (len > 3 && s[len-1] == 'e')len--;
    return len;
}
}