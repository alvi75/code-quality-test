public boolean find(int start) {
    matchFound = findImpl(address, input, start, end);
    if (matchFound) {
        findPos = matchOffsets[1];
    }
    return matchFound;
}