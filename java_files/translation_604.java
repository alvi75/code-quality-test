ublic List<Head> getNextHeads(char c) {
    if (matches(c)) {
        return newHeads;
    }
    else {
        return FileNameMatcher.EMPTY_HEAD_LIST;
    }
}