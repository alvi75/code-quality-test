import java.util.*;

public class Translation333 {
    public float docFreq(int docId, String field, int numPayloadsSeen, float payload) {
    return numPayloadsSeen > 0 ? (payload / numPayloadsSeen) : 1;
}
}