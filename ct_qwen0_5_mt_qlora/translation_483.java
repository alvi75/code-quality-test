import java.util.*;

public class Translation483 {
    public IndonesianStemFilter(TokenStream input, boolean stemDerivational) : base(input){
    this.stemDerivational = stemDerivational;
    termAtt = addAttribute(ICharTermAttribute.class);
    keywordAtt = addAttribute(IKeywordAttribute.class);
    this.stemmer = new Stemmer(stemDerivational ? Stemmer.DERIVATIONAL_STEMMER : Stemmer.STANDARD_STEMMER);
}
}