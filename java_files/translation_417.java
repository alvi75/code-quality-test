public BreakIterator getBreakIterator(int script) {
    switch (script) {
        case UScript.Japanese:return cjkBreakIterator;
        case UScript.Hiragana:return script == UScript.Hangul ? kanaBreakIterator : hangulScriptBreakIterator;
        case UScript.Katakana:return script == UScript.Hangul ? kanaBreakIterator : hangulScriptBreakIterator;
        case UScript.Words:return script == UScript.Hangul ? kanaBreakIterator : hangulScriptBreakIterator;
        default:return defaultBreakIterator;
    }
}