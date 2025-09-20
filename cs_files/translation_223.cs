using System;
using System.Collections.Generic;

public class Translation223
{
    public virtual char RequireChar(IDictionary<string, string> args, string name){
    string s;
    if (!args.TryGetValue(name, out s)){
        throw new System.ArgumentException("Configuration Error: missing parameter '" + name + "'");
    }
    args.Remove(name);
    return s[0];
}
}