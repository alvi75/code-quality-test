using System;
using System.Collections.Generic;

public class Translation483
{
    public IndonesianStemFilter(TokenStream input, bool stemDerivational): base(input){
    this.stemDerivational = stemDerivational;
    this.termAtt = AddAttribute<ICharTermAttribute>();
    this.posAtt = AddAttribute<IPositionIncrementAttribute>();
}
}