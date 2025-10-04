import java.util.*;

public class Translation333 {
    public float docScore(int docId, String field, int numPayloadsSeen, float payloadScore) {
    if (numPayloadsSeen == 0) {
        return 1;
    }
    else {
        return payloadScore / numPayloadsSeen;
    }
}
}