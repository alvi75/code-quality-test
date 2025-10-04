import java.util.*;

public class Translation645 {
    public int stem(char s[], int len) {
    final int numVowels = numVowels(s, len);
    for (int i = 0;
    i < affixes.length;
    i++) {
        final Affix affix = affixes[i];
        if (numVowels > affix.vc && len >= affix.affix.length() + 3&& endsWith(affix.affix, s, len)) {
            len = deleteN(s, len - affix.affix.length(), len);
            return len;
        }
    }
    return len;
}
}