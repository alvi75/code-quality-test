import java.util.*;

public class Translation405 {
    public int following(int pos) {
    if (pos < text.beginIndex() || pos > text.endIndex()) {
        throw new IllegalArgumentException("offset out of bounds");
    }
    else if (0 == sentenceStarts.length) {
        text.setIndex(text.beginIndex());
        return DONE;
    }
    else if (pos >= sentenceStarts[sentenceStarts.length-1]) {
        text.setIndex(text.endIndex());
        currentSentence = sentenceStarts.length-1;
        return DONE;
    }
    else {
        currentSentence = (sentenceStarts.length-1)/2;
        moveToSentenceAt(pos, 0, sentenceStarts.length-2);
        text.setIndex(sentenceStarts[++currentSentence]);
        return CURRENT;
    }
}
}