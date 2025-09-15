import java.util.*;

public class Translationtranslation_645 {
    public int stem(char s[], int len) {
        final int numVowels = numVowels(s, len);
        for (int i = 0;
        i < affixes.length;
        i++) {
            final Affix affix = affixes[i];
            if (numVowels > affix.vc && len >= affix.affix.length() + 3 && endsWith(s, len, affix.affix)) {
                len = removeSuffix(len, affix.affix);
                if (len <= 3)break;
            }
            if (len <= 3) {
                return len;
            }
        }
        return len;
    }
}