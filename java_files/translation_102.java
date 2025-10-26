import java.util.*;

public class Translation102 {
    public final TokenStream create(TokenStream input) {
    return new HyphenatedWordsFilter(input);
}
}