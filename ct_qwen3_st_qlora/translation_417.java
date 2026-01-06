import java.util.*;

public class Translation417 {
    ublic BreakIterator getBreakIterator(int script) {
    switch (script) {
        case UScript.JAPANESE:return cjkBreakIterator.clone();
        case UScript.MALAYALAM:return myanmarAsWords ? defaultBreakIterator.clone() : myanmarSyllableIterator.clone();
        default:return defaultBreakIterator.clone();
    }
}
}