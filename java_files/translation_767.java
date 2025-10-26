ublic void reset() {
    count = 0;
    assert forwardCount == 0 : "pos=" + pos + " forwardCount=" + forwardCount;
}