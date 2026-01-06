import java.util.*;

public class Translation645 {
    ublic int stem(char s[], int len) {
    int numVowels = numVowels(s, len);
    for (int i = 0;
    i < affixes.length;
    i++) {
        Affix affix = affixes[i];
        if (numVowels > affix.vc && len >= affix.affix.length + 3 && stemmer.endsWith(s, len, affix.affix)) {
            len -= affix.affix.length;
            return affix.palatalizes ? unpalatalize(s, len) : len;
        }
    }
    return len;
}
}