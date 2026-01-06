import java.util.*;

public class Translation645 {
    public int stem(char s[], int len) {
    int numVowels = numVowels(s, len);
    for (int i = 0;
    i < affixes.length;
    i++) {
        Affix affix = affixes[i];
        if (numVowels > affix.vc && len >= affix.affix.length + 3 && endsWith(s, len, affix.affix)) {
            len -= affix.affix.length;
            return palatalizes ? unpalatalize(s, len) : len;
        }
    }
    return len;
}
}