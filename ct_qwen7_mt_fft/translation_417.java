import java.util.*;

public class Translation417 {
    public BreakIterator getBreakIterator(int script) {
    switch(script) {
        case UScript.JAPANESE:return (BreakIterator)japaneaseBreakIter.clone();
        case UScript.MYANMAR:return (BreakIterator)myanmarBreakIter.clone();
        default:return (BreakIterator)defaultBreakIter.clone();
    }
}
}