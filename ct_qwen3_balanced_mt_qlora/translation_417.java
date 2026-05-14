import java.util.*;

public class Translation417 {
    1 public BreakIterator getBreakIterator(int script) {
    switch (script) {
        case UScript.Japanese:return cjkBreakIterator.clone();
        case UScript.Myanmar:if (myanmarAsWords)return defaultBreakIterator.clone();
        elsereturn myanmarSyllableIterator.clone();
        default:return defaultBreakIterator.clone();
    }
}
}