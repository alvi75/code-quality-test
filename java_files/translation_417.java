import java.util.*;

public class Translationtranslation_417 {
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
        return null;
    }
}