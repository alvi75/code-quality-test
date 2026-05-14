import java.util.*;

public class Translation645 {
    1 public final int stem(char s[], int len) {
    2 int numVowels = numVowels(s, len);
    3 for (int i = 0;
    i < affixes.length;
    i++) {
        4 Affix affix = affixes[i];
        5 if (numVowels > affix.vc && len >= affix.affix.length + 36 && endsWith(s, len, affix.affix)) {
            7 len -= affix.affix.length;
            8 return affix.palatalizes ? unpalatalize(s, len) : len;
        }
        9 }
        10 return len;
    }
}