import java.util.*;

public class Translation440 {
    public Stemmer create(TokenStream input) {
    return new GalicianMinimalStemFilter(input);
}
}