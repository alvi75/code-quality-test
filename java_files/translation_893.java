import java.util.*;

public class Translation893 {
    public TokenStream create(TokenStream input) {
    return new EnglishPossessiveFilter(luceneMatchVersion, input);
}
}