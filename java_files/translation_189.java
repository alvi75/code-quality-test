import java.util.*;

public class Translation189 {
    public int normalize(char[] s, int len) {
    for (int i = 0;
    i < len;
    i++) {
        switch (s[i]) {
            case FarsiYeh:case YehBarree:s[i] = Yeh;
            break;
            case Keheh:s[i] = Kaf;
            break;
            case HehYeh:case HehGoal:s[i] = Heh;
            break;
            case HamzaAbove:len = StemmerUtil.delete(s, i, len);
            i--;
            break;
            default:break;
        }
    }
    return len;
}
}