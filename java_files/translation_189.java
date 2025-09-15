import java.util.*;

public class Translationtranslation_189 {
    public int normalize(char s[], int len) {
        for (int i = 0;
        i < len;
        i++) {
            switch (s[i]) {
                case FARDSI_YEH:case YEH_barree: s[i] = YEH;
                break;
                case KEHEH: s[i] = KAF;
                break;
                case HEH_YEH:case HEH_goal: s[i] = HEH;
                break;
                case HAMZA_ABOVE: len = delete(s, i, len);
                i--;
                break;
                default: break;
            }
        }
        return len;
    }
}