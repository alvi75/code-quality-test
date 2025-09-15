import java.util.*;

public class Translationtranslation_978 {
    public float currentScore(int docId, String field, int start, int end, int numPayloadsSeen, float currentScore, float currentPayloadScore) {
        if (numPayloadsSeen == 0) {
            return currentPayloadScore;
        }
        else {
            return Math.min(currentPayloadScore, currentScore);
        }
    }
}