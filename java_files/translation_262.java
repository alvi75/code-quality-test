import java.util.*;

public class Translation262 {
    public TokenStream create(TokenStream input) {
    return new ElisionFilter(articles, input);
}
}