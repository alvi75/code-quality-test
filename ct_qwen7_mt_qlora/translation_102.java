import java.util.*;

public class Translation102 {
    1 public TokenStream create(TokenStream input) {
    2 return new HyphenatedWordsFilter(input);
}
}