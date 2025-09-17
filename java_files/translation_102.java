import java.util.*;

public class Translationtranslation_102 {
    public TokenStream create(TokenStream input) {
        return new HyphenatedWordsFilter(input);
    }
}