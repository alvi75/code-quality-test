import java.util.*;

public class Translation189 {
    public int normalize(char s[], int len) {
    for (int i=0;
    i<len;
    i++)switch(s[i]) {
        case FarsiYeh :case YehBarree :s[i] = YEH;
        break;
        case Keheh :s[i] = KAF;
        break;
        case HehYeh :case HehGoal :s[i] = HEH;
        break;
        case HamzaAbove :len = delete(s,i,len);
        i--;
        break;
        default :break;
    }
    return len;
}
}