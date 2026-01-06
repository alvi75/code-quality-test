import java.util.*;

public class Translation189 {
    public int normalize(char s[], int len) {
    for(int i=0;
    i<len;
    i++) {
        switch(s[i]) {
            case 'ی':s[i]='ي';
            break;
            case 'ه':if(i>1 && s[i-2]=='و') break;
            s[i]='ء';
            break;
            case 'ئ':s[i]='ى';
            break;
            case 'ة':len--;
            break;
            default:break;
        }
    }
    return len;
}
}