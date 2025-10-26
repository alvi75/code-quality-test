ublic synchronized void incrementProgressBy(int diff) {
    if (diff < 0) throw new IllegalArgumentException("Cannot decrement progress by a negative amount");
    int oldProgress = mProgress;
    mProgress += diff;
    while (oldProgress > mMaxProgress && diff > 0) {
        incrementProgressBy(1);
        diff--;
    }
    while (oldProgress < mMinProgress && diff < 0) {
        decrementProgressBy(-1);
        diff++;
    }