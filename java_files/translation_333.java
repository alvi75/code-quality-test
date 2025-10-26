import java.util.*;

public class Translation333 {
    public float docScore(int docID, String field, int numPayloadsSeen, float payloadScore) {
    return numPayloadsSeen > 0 ? (payloadScore / numPayloadsSeen) : 1;
}
}