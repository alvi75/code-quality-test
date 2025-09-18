public int compareTo(SearcherTracker other) {
    return Double.compare(other.recordTimeSec, recordTimeSec);
}