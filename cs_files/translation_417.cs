using System;
using System.Collections.Generic;

public class Translation417
{
    public virtual IRuleBasedBreakIterator GetBreakIterator(int script){
    switch (script){
        case UScript.HANGUL: return GetHangulScriptBreakIterator();
        case UScript.HANGUL_YEH: return GetHangulScriptBreakIterator(YEH);
        case UScript.HANGUL_KANA: return GetHangulScriptBreakIterator(KANA);
        case UScript.HANGUL_LETTER: return GetHangulScriptBreakIterator(LETTER);
        case UScript.HANGUL_NUMBER: return GetHangulScriptBreakIterator(NUMBER);
        case UScript.HANGUL_YEH_NUMBER: return GetHangulScriptBreakIterator(YEH_NUMBER);
        default: return base.GetBreakIterator(script);
    }
}
}