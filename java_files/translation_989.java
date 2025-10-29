import java.util.*;

public class Translation989 {
    0) {
    findPos = _regionStart;
}
else if (findPos >= _regionEnd) {
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