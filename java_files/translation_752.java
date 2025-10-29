import java.util.*;

public class Translation752 {
    public Token LT(int k) {
    LazyInit();
    if (k == 0) {
        return null;
    }
    if (k < 0) {
        return LB(-k);
    }
    int i = p + k - 1;
    Sync(i);
    if (i >= tokens.size()) {
        return tokens.get(tokens.size() - 1);
    }
    return tokens.get(i);
}
}