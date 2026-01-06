import java.util.*;

public class Translation372 {
    public int sumTokenSizes(int fromIx, int toIx) {
    int result = 0;
    for (int i = fromIx;
    i < toIx;
    i++) {
        result += _ptgs[i].size();
    }
    return result;
}
}