import java.util.*;

public class Translation989 {
    public boolean find(int start_1) {
    findPos = start_1;
    if (findPos < regionStart) {
        findPos = regionStart;
    }
    else if (findPos >= regionEnd) {
        matchFound = false;
        return false;
    }
    matchFound = findImpl(address, input, findPos, matchOffsets);
    if (matchFound) {
        findPos = matchOffsets[1];
    }
    return matchFound;
}
}