import java.util.*;

public class Translation978 {
    public float currentScore(int docId, String field, int start, int end, int numPayloadsSeen, float currentScore, float currentPayloadScore) {
    if (numPayloadsSeen == 0)return currentPayloadScore;
    elsereturn Math.min(currentPayloadScore, currentScore);
}
}