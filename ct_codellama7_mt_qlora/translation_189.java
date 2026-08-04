import java.util.*;

public class Translation189 {
    public int normalize(char[] s, int len) {
    for (int i = 0;
    i < len;
    i++) {
        switch (s[i]) {
            case FARSI_YEH:case YEH_BARREE:s[i] = YEH;
            break;
            case KEHEH:s[i] = KAF;
            break;
            case HEH_YEH:case HEH_GOAL:s[i] = HEH;
            break;
            case HAMZA_ABOVE:len = StemmerUtil.delete(s, i, len);
            i--;
            break;
            default:break;
        }
    }
    return len;
}
}