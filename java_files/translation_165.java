import java.util.*;

public class Translation165 {
    public Stemmer create(TokenStream input) {
    return new PortugueseStemFilter(input);
}
}