import java.util.*;

public class Translation102 {
    1 public TokenStream create(TokenStream input) {
    return new HyphenatedWordsFilter(input);
}
}