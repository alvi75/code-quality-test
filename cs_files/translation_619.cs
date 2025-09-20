using System;
using System.Collections.Generic;

public class Translation619
{
    public ParserExtension GetExtension(string key){
    if (this.extensions.ContainsKey(key)){
        return this.extensions[key];
    }
    return null;
}
}