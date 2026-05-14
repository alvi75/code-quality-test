import java.util.*;

public class Translation645 {
    public int stem(char s[], int len) {
    final int origLen = len;
    len = deleteNounSuffix(s, len);
    if (len == origLen) {
        len = deleteVerbSuffix(s, len);
    }
    if (len == origLen) {
        len = deleteAdjectiveSuffix(s, len);
    }
    if (len == origLen) {
        len = deleteAdverbSuffix(s, len);
    }
    if (len == origLen) {
        len = deleteSubstantiveSuffix(s, len);
    }
    return len;
}
}