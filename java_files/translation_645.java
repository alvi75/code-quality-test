import java.util.*;

public class Translationtranslation_645 {
    public int stem(char s[], int len) {
        final int numVowels = numvowels(s, len);
        for (int i = 0;
        i < affixes.length;
        i++) {
            final Affix affix = affixes[i];
            if (numVowels > affix.min && endsWith(affix.prefix, s, len)) {
                len = deleteN(s, len - affix.len, len, affix.prefix.length);
                return affix.cmd;
            }
            if (endsWith("ища", s, len)) {
                len--;
                s[len-1] = 'e';
            }
            return len;
        }
}