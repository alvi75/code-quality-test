import java.util.*;

public class Translationtranslation_405 {
    public int following(int pos) {
        if (pos < text.getBeginIndex() || pos > text.getEndIndex()) {
            throw new IllegalArgumentException("offset out of bounds");
        }
        else if (0 == sentenceStarts.length) {
            text.setIndex(text.getBeginIndex());
            return DONE;
        }
        else if (pos >= sentenceStarts[sentenceStarts.length-1]) {
            text.setIndex(text.getEndIndex());
            currentSentence = sentenceStarts.length-1;
            return DONE;
        }
        else {
            currentSentence = (sentenceStarts.length-1) / 2;
            moveToSentenceAt(pos, 0, sentenceStarts.length-2);
            text.setIndex(sentenceStarts[++currentSentence]);
        }
        return current();
    }
}