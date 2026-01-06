import java.util.*;

public class Translation645 {
    public int stem(char s[], int len) {
    final int numVowels_Renamed = numVowels(s, len);
    for (int i=0;
    i<affixes.length;
    i++) {
        Affix affix = affixes[i];
        if (numVowels_Renamed > affix.vc && len >= affix.affix.length+3 && StemmerUtil.endsWith(s, len, affix.affix)) {
            len -= affix.affix.length;
            return affix.palatalizes ? unPalatalize(s, len) : len;
        }
    }
    return len;
}
}