import java.util.*;

public class Translation417 {
    public BreakIterator getBreakIterator(int script) {
    switch(script) {
        case UScript.JAVA: return cjkBreakIterator.clone();
        case UScript.MYANMAR: if(myanmarAsWords) {
            return defaultBreakIterator.clone();
        }
        else {
            return myanmarSyllableIterator.clone();
        }
        default: return defaultBreakIterator.clone();
    }
}
}