import java.util.*;

public class Translation405 {
    public int following(int pos) {
    if (pos < getText().getBeginIndex() || pos > getText().getEndIndex()) {
        throw new IllegalArgumentException("offset out of bounds");
    }
    else if (0 == sentenceStarts.length) {
        getText().setIndex(getText().getBeginIndex());
        return DONE;
    }
    else if (pos >= sentenceStarts[sentenceStarts.length-1]) {
        getText().setIndex(getText().getEndIndex());
        currentSentence = sentenceStarts.length-1;
        return DONE;
    }
    else {
        currentSentence = (sentenceStarts.length-1)/2;
        if (pos < sentenceStarts[currentSentence]) {
            int i = Arrays.binarySearch(sentenceStarts, 0, sentenceStarts.length-1, pos);
            if (i >= 0) {
                currentSentence=i;
            }
            else {
                currentSentence=-i-1;
            }
        }
        moveIndex();
        getText().setIndex(sentenceStarts[currentSentence]);
        return getCurrent();
    }
}
}