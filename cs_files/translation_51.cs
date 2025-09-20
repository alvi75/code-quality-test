using System;
using System.Collections.Generic;

public class Translation51
{
    public IList<CharsRef> UniqueStems(char[] word, int length){
    IList<CharsRef> stems = Stem(word, length);
    if (stems.Count < 2){
        return stems;
    }
    var terms = new CharArraySet(8, dictionary);
    IList<CharsRef> deduped = new List<CharsRef>();
    foreach (var stem in stems){
        if (!terms.Contains(stem)){
            deduped.Add(stem);
            terms.Add(stem);
        }
    }
    return deduped;
}
}