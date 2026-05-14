import java.util.*;

public class Translation483 {
    public IndonesianStemFilter(TokenStream input, boolean stemDerivational) {
    super(input);
    stemmer = new Stemmer();
    this.stemDerivational = stemDerivational;
}
}