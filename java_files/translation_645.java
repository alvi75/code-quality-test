import java.util.*;

public class Translation645 {
    public int stem(char s[], int len) {
    final int numvowels = numvowels(s, len);
    for (int i = 0;
    i < affixes.length;
    i++) {
        final Affix affix = affixes[i];
        if (numvowels > affix.vc && endsWith(s, len, affix.affix)) {
            len = len - affix.affix.length();
            return affix.palatalizes ? unpalatalize(s, len) : len;
        }
    }
    return len;
}
}