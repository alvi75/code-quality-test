import java.util.*;

public class Translation417 {
    public BreakIterator getBreakIterator(int script) {
    switch (script) {
        case UScript.Japanese:return (BreakIterator) cjkBreakIterator.clone();
        case UScript.Myanmar:if (myanmarAsWords) {
            return (BreakIterator) defaultBreakIterator.clone();
        }
        else {
            return (BreakIterator) myanmarSyllableIterator.clone();
        }
        default: return (BreakIterator) defaultBreakIterator.clone();
    }
}
}