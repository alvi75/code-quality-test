import java.util.*;

public class Translation102 {
    public TokenStream create(TokenStream input) {
    return new HyphenatedWordsFilter(input);
}
}