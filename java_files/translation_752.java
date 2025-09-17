import java.util.*;

public class Translationtranslation_752 {
    public Token LT(int k) {
        lazyInit();
        if ( k == 0 ) return null;
        if ( k < 0 ) return LB(-k);
        int i = p + k - 1;
        sync(i);
        if ( i >= tokens.size() ) return null;
        return tokens.get(i);
    }
}