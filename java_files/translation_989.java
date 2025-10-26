ublic boolean find(int start) {
    findPos = start;
    if (findPos < regionStart) {
        findPos = regionStart;
    }
    else if (findPos >= regionEnd) {
        matchFound = false;
        return false;
    }
}
boolean matchFound = findImpl(address, input, findPos, matchOffsets);
if (matchFound) {
    findPos = matchOffsets[1];
}
return matchFound;
}