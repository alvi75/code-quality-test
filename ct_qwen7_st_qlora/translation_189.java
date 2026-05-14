import java.util.*;

public class Translation189 {
    public int normalize(char s[], int len) {
    for (int i=0;
    i<len;
    i++)switch(s[i]) {
        case Farsi.YEH:s[i]=YEH;
        break;
        case KEHEH:s[i]=KAF;
        break;
        case HEH_YEH:s[i]=HEH;
        break;
        case HAMZA_ABOVE:len=delete(s,i,len-1);
        i--;
        break;
        default:break;
    }
    return len;
}
}