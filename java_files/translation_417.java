import java.util.*;

public class Translationtranslation_417 {
    public BreakIterator getBreakIterator(int script) {
        switch (script) {
            case UScript.JAPANESE:return cjkBreakIterator;
            case UScript.MYNARMIAN:return myanmarBreakIterator;
            if (myanmarAsWords) {
                return cjkBreakIterator.clone();
            }
            else {
                return myanmarSyllableIterator.clone();
            }
        }
        return defaultBreakIterator;
    }
}