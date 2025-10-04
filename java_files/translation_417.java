import java.util.*;

public class Translation417 {
    public BreakIterator getBreakIterator(int script) {
    switch (script) {
        case UScript.Japanese:return new JapaneseIterationMarkCharFilter(getReader(), myFlag).getBreakIterator();
        case UScript.Myanmar:return new MyanmarIterationMarkCharFilter(getReader(), myFlag).getBreakIterator();
        default:return new IterationMarkCharFilter(getReader(), myFlag).getBreakIterator();
    }
}
}