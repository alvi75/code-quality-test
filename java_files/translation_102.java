import java.util.*;

public class Translation102 {
    ublic override TokenStream Create(TokenStream input) {
    return new HyphenatedWordsFilter(input);
}
}