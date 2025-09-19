import java.util.*;

public class Translation102 {
    ublic TokenStream create(TokenStream input) {
    return new HyphenatedWordsFilter(input);
}
}