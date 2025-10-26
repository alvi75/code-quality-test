import java.util.*;

public class Translation483 {
    ublic IndonesianStemFilter(TokenStream input, boolean stemDerivational) : base(input){
    this.stemDerivational = stemDerivational;
    termAtt = addAttribute(ICharTermAttribute.class);
    keywordAtt = addAttribute(IKeywordAttribute.class);
}
}