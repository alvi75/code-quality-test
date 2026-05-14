import java.util.*;

public class Translation417 {
    public BreakIterator getBreakIterator(int script) {
    switch(script) {
        case UScript.JAPANESE:return cjkBreakIterator;
        case UScript.KOREAN:return hangulBreakIterator;
        case UScript.CHINESE:return cjkBreakIterator;
        case UScript.MYANMAR:if (myanmarAsWords)return defaultBreakIterator;
        elsereturn myanmarSyllableIterator;
        default:return defaultBreakIterator;
    }
}
}