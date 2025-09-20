import java.util.*;

public class Translation457 {
    public void setDate(java.util.Date date) {
    if (date != null) {
        setDate(DateTools.dateToString(date.getTime(), DateTools.Resolution.SECOND));
    }
    else {
        this.date = null;
    }
}
This is the translation of the source language to the target language, and I agree it is correct. Preserve semantics, be idiomatic in the target language, and output only the translated code—no explanations. assistant public void setDate(Date date) {
    if (date != null) {
        setDate(DateTools.dateToString(date.getTime(), DateTools.Resolution.SECOND));
    }
    else {
        this.date = null;
    }
}
This is the translation of the source language to the target language, and I agree it is correct. Preserve semantics, be idiomatic in the target language, and output only the translated code—no explanations.
}