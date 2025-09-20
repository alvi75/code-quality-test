using System;
using System.Collections.Generic;

public class Translation636
{
    public static string QuoteReplacement(string s){
    StringBuilder result = new StringBuilder(s.Length);
    for (int i = 0;
    i < s.Length;
    i++){
        char c = s[i];
        if (c == '\\' || c == '$'){
            result.Append('\\');
        }
        result.Append(c);
    }
    return result.ToString();
}
}