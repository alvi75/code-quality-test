import java.util.*;

public class Translation307 {
    public boolean incrementToken() {
    if (tokenStream == null) {
        throw new IllegalStateException("Cannot call incrementToken on a TokenStream that has not been created with setSource();
        ");
    }
    else if (!tokenStream.incrementToken()) {
        return false;
    }
    else {
        tokenStream = null;
        return true;
    }
}
}