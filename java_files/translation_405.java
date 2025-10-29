import java.util.*;

public class Translation405 {
    0;
else if (pos >= sentenceStarts[sentenceStarts.length - 1]) {
    text.setIndex(text.getEndIndex());
    currentSentence = sentenceStarts.length - 1;
    return DONE;
}
else {
    currentSentence = (sentenceStarts.length - 1) / 2;
    moveToSentenceAt(pos, 0, sentenceStarts.length - 2);
    text.setIndex(sentenceStarts[++currentSentence]);
    return CURRENT;
}
}