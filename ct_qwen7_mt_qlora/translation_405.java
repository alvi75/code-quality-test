import java.util.*;

public class Translation405 {
    4 public final int following(int pos) {
    5 if (pos < text.getBeginIndex() || pos > text.getEndIndex())6 throw new IllegalArgumentException("offset out of bounds");
    7 else if (0 == sentenceStarts.length)8 text.setIndex(text.getBeginIndex());
    9 else if (pos >= sentenceStarts[sentenceStarts.length - 1])10 text.setIndex(text.getEndIndex());
    11 else {
        12 currentSentence = (sentenceStarts.length - 1) / 2;
        13 moveToSentenceAt(pos, 0, sentenceStarts.length - 2);
        14 text.setIndex(sentenceStarts[++currentSentence]);
        15 return current();
    }
}
}