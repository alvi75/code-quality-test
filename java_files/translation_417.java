import java.util.*;

public class Translation417 {
    ublic BreakIterator getBreakIterator(int script) {
    switch (script) {
        case UScript.JAPANESE:return (BreakIterator) cjkBreakIterator.clone();
        case UScript.MYANMAR:return (BreakIterator) (myanmarAsWords ? defaultBreakIterator.clone() : myanmarSyllableIterator.clone());
        default:return (BreakIterator) defaultBreakIterator.clone();
    }
}
}