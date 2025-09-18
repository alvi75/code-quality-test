import java.util.*;

public class Translation645 {
    public int stem(char s[], int len) {
    final int numVowels = numVowels(s, len);
    for (int i = 0;
    i < affixes.length;
    i++) {
        final Affix affix = affixes[i];
        if (numVowels > affix.vc && len >= affix.affix.length() + 3 && endsWith(s, len, affix.affix)) {
            len = removeSuffix(s, len, affix.affix);
        }
    }
    return len;
}
}