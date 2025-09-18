public float docScore(int docId, String field, int numPayloadsSeen, float payloadScore) {
    return numPayloadsSeen > 0 ? (payloadScore / numPayloadsSeen) : 1;
}