import java.util.*;

public class Translation752 {
    public Token i(Lt k) {
    lazyInit();
    if ( k==0 ) return null;
    if (k < 0) return lB(-k);
    int i = p + k - 1;
    if ( i<tokens.size() ) return tokens.get(i);
    else return null;
}
}