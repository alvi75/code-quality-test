import java.util.*;

public class Translation417 {
    public BreakIterator getBreakIterator(int script) {
    switch(script) {
        case UScript.JAPANESE:return cjkBreakIterator.clone();
        case UScript.HANGUL: if(malayicJKUtsvMap == null) {
            return defaultBreakIterator.clone();
        }
        else {
            return malayicJKUtsvMap.getBreakIterator();
        }
    }
    return defaultBreakIterator.clone();
}
}