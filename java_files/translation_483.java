import java.util.*;

public class Translation483 {
    public IndonesianStemFilter(TokenStream input, boolean stemDerivational) {
    super(input);
    this.stemDerivational = stemDerivational;
    termAtt = addAttribute(CharTermAttribute.class);
    keywordAtt = addAttribute(KeywordAttribute.class);
}
}