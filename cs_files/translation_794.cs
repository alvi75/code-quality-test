using System;
using System.Collections.Generic;

public class Translation794
{
    public virtual int Stem(char[] s, int len){
    if (len > 4 && StemmerUtil.EndsWith(s, len, "es")){
        len--;
    }
    if (len > 5 && (StemmerUtil.EndsWith(s, len, "ene") || (StemmerUtil.EndsWith(s, len, "ane") && UseNounPhraseStyles))){
        return len - 3;
    }
    if (len > 4 && (StemmerUtil.EndsWith(s, len, "er") || StemmerUtil.EndsWith(s, len, "en") || StemmerUtil.EndsWith(s, len, "et") || (StemmerUtil.EndsWith(s, len, "ar") && UseNounPhraseStyles)){
        return len - 2;
    }
    if (len > 3){
        switch (s[len - 1]){
            case 'a':case 'e':return len - 1;
            break;
            case 'i':case 'o':case 'u':for (int i = 0;
            i < len - 1;
            i++){
                if (StemmerUtil.IsVowel(s[i]) || StemmerUtil.IsVowel(s[i + 1])){
                    s[i] = 'y';
                }
            }
            break;
        }
    }
    return len;
}
}