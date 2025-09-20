using System;
using System.Collections.Generic;

public class Translation645
{
    public virtual int Stem(char[] s, int len){
    int numVowels = NumVowels(s, len);
    for (int i = 0;
    i < affixes.Length;
    i++){
        Affix affix = affixes[i];
        if (numVowels > affix.m_vocals && len >= affix.m_affix.Length + 3 && StemmerUtil.EndsWith(s, len, affix.m_affix)){
            len -= affix.m_affix.Length;
            return affix.palatalizes ? Unpalatalize(s, len) : len;
        }
    }
    return len;
}
}