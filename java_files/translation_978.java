import java.util.*;

public class Translation978 {
    ublic override float CurrentScore(int docId, string field, int start, int end, int numPayloadsSeen, float currentScore, float currentPayloadScore) {
    if (numPayloadsSeen == 0) {
        return currentPayloadScore;
    }
    else {
        return Math.min(currentPayloadScore, currentScore);
    }
}
}