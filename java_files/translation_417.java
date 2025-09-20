import java.util.*;

public class Translation417 {
    public BreakIterator getBreakIterator(int script) {
    switch (script) {
        case UScript.Japanese:return cjkBreakIterator.clone();
        case UScript.Myanmar:if (myanmarAsWords) {
            return defaultBreakIterator.clone();
        }
        else {
            return myanmarSyllableIterator.clone();
        }
        default: return defaultBreakIterator.clone();
    }
}
}