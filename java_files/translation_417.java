import java.util.*;

public class Translation417 {
    public BreakIterator getBreakIterator(int script) {
    switch (script) {
        case UScript.JAPANESE:return new JapaneseIterationMarkCharFilter(null, myanmarStemFilter);
        case UScript.MALAYALAM:return new MalayalamStemFilter(null, myanmarStemFilter);
        case UScript.TAMIL:return new TamilStemFilter(null, myanmarStemFilter);
        case UScript.HANGUL:return new HanguelStemFilter(null, myanmarStemFilter);
        case UScript.KANA:return new KatakanaStemFilter(null, myanmarStemFilter);
        case UScript.LATIN:return new LatinStemFilter(null, myanmarStemFilter);
        case UScript.OTHER:return new OtherStemFilter(null, myanmarStemFilter);
    }
    else {
        throw new IllegalArgumentException("Unsupported script " + script);
    }
    return null;
}
}