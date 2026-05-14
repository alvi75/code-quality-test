import java.util.*;

public class Translation333 {
    public float docScore(int docId, String fieldName, int numPayloadsSeen, double payloadScore) {
    if(numPayloadsSeen == 0) return 1;
    return (float)(payloadScore/numPayloadsSeen);
}
}