import java.util.*;

public class Translationtranslation_417 {
    public BreakIterator getBreakIterator(int script) {
        switch (script) {
            case UScript.JAPANESE:return cjkBreakIterator;
            case UScript.MYANMAR:return myanmarAsWords ? defaultBreakIterator : myanmarSyllableIterator;
            default:return defaultBreakIterator;
        }
    }
}