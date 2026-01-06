import java.util.*;

public class Translation752 {
    public Token lt(int k) {
    lazyInit();
    if (k == 0)return null;
    if (k < 0)return lb(-k);
    int i = p + k - 1;
    sync(i);
    if (i >= tokens.size())return tokens.get(tokens.size() - 1);
    return tokens.get(i);
}
}