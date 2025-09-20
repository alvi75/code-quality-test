using System;
using System.Collections.Generic;

public class Translation673
{
    public static int GetEffectivePort(string scheme, int specifiedPort){
    if (specifiedPort != -1){
        return specifiedPort;
    }
    if ("http".Equals(scheme, StringComparison.Ordinal)){
        return 80;
    }
    else if ("https".Equals(scheme, StringComparison.Ordinal)){
        return 443;
    }
    else{
        return -1;
    }
}
}