import java.util.*;

public class Translation989 {
    public boolean find(int start_1) {
    findPos = start_1;
    if (findPos < _regionStart) {
        findPos = _regionStart;
    }
    else {
        if (findPos >= _regionEnd) {
            matchFound = false;
            return false;
        }
    }
    matchFound = findImpl(address, input, findPos, matchOffsets);
    if (matchFound) {
        findPos = matchOffsets[1];
    }
    return matchFound;
}
}