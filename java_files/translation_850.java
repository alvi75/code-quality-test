import java.util.*;

public class Translationtranslation_850 {
    public void discardResultContents() {
        resultContents = null;
    }
    Result r = getResult();
    if (r instanceof ResultContent) {
        ((ResultContent)r).discard();
    }
    }
}