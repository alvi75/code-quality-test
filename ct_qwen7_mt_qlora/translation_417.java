import java.util.*;

public class Translation417 {
    1 public static BreakIterator getBreakInstance(Locale locale, int type) {
    2 switch (type) {
        3 case BREAK_CHARACTER :4 return new CharacterBreakIterator(locale);
        5 case BREAK_WORD :6 return new WordBreakIterator(locale);
        7 default :8 throw new IllegalArgumentException("Unknown break iterator type");
        9 }
    }
}