import java.util.*;

public class Translation978 {
    1 public float currentScore(int docId, String field, int start,int end,int numPayloadsSeen,float currentScore,float currentPayloadScore) {
    2 if (numPayloadsSeen == 0)3 return currentPayloadScore;
    4 else5 return Math.min(currentPayloadScore, currentScore);
    6 }
}