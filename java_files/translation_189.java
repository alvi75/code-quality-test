import java.util.*;

public class Translation189 {
    public int normalize(char[] s, int len) {
    for (int i = 0;
    i < len;
    i++) {
        switch (s[i]) {
            case 'ی': case 'ه': if (i > 0 && s[i - 1] == 'ء') {
                s[i] = 'ی';
            }
            else {
                s[i] = 'ه';
            }
            break ;
            case 'ك': if (i > 0 && s[i - 1] == 'ئ' || i > 0 && s[i - 1] == 'ء') {
                s[i] = 'ك';
            }
            else {
                s[i] = 'ح';
            }
            break ;
            case 'ة': if (i > 0 && s[i - 1] == 'و') {
                s[i] = 'ه';
            }
            else {
                s[i] = 'ه';
            }
            break ;
            case 'ؤ': case 'ئ': case 'ء': s[i] = 'ا';
            break ;
            case 'ي': case 'ى': if (i > 0 && s[i - 1] == 'ء') {
                s[i] = 'ی';
            }
            else {
                s[i] = 'ی';
            }
            break ;
            case 'ه': if (i > 0 && s[i - 1] == 'و') {
                s[i] = 'ه';
            }
            else {
                s[i] = 'ه';
            }
            break ;
            default :break ;
        }
    }
    return len;
}
}