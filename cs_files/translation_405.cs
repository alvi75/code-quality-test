using System;
using System.Collections.Generic;

public class Translation405
{
    public override int Following(int pos){
    if (pos < text.BeginIndex || pos > text.EndIndex){
        throw new ArgumentException("offset out of bounds");
    }
    else if (0 == sentenceStarts.Length){
        text.SetIndex(text.BeginIndex);
        currentSentence = 0;
        return Done;
    }
    else if (pos >= sentenceStarts[sentenceStarts.Length - 1]){
        text.SetIndex(text.EndIndex);
        currentSentence = sentenceStarts.Length - 1;
        return Done;
    }
    else{
        currentSentence = sentenceStarts.Length / 2;
        ToSentenceAt(pos, 0, sentenceStarts.Length - 2);
        text.SetIndex(sentenceStarts[++currentSentence]);
        return Current;
    }
}
}