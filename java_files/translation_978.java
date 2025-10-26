import java.util.*;

public class Translation978 {
    public final float currentScore(int docID, String field, int start, int end, int numPayloadsSeen, float currentScore, float currentPayloadScore) {
    if (numPayloadsSeen == 0) {
        return currentPayloadScore;
    }
    else {
        return Math.min(currentPayloadScore, currentScore);
    }
}
}