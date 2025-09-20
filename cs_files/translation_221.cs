using System;
using System.Collections.Generic;

public class Translation221
{
    public virtual string Stem(string word){
    var cmd = stemmer.GetLastOnPath(word);
    if (cmd == null){
        return null;
    }
    var builder = new StringBuilder(word.Length - cmd.Length);
    for (int i = 0;
    i < word.Length;
    i++){
        builder.Append(Char.ConvertFromUtf32(cmd.CodePointAt(i)));
    }
    return builder.ToString();
}
}