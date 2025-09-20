using System;
using System.Collections.Generic;

public class Translation353
{
    public JapaneseIterationMarkCharFilter(TextReader input, bool normalizeKanji, bool normalizeKana): base(input){
    this.normalizeKanji = normalizeKanji;
    this.normalizeKana = normalizeKana;
    buffer.Reset(input);
}
}