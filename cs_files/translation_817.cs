using System;
using System.Collections.Generic;

public class Translation817
{
    public virtual string Get(string name, string dflt){
    string[] vals;
    object temp;
    if (valByRound.TryGetValue(name, out temp) && temp != null){
        vals = (string[])temp;
        return vals[roundNumber % vals.Length];
    }
    string sval;
    if (!props.TryGetValue(name, out sval)){
        sval = dflt;
    }
    if (sval == null){
        return null;
    }
    if (sval.IndexOf(':') < 0){
        return sval;
    }
    else if (sval.IndexOf(":\\", StringComparison.Ordinal) >= 0 || sval.IndexOf(":/", StringComparison.Ordinal) >= 0){
        return sval;
    }
    int k = sval.IndexOf(':');
    string colName = sval.Substring(0, k - 0);
    sval = sval.Substring(k + 1);
    colForValByRound[name] = colName;
    vals = PropToStringArray(sval);
    valByRound[name] = vals;
    return vals[roundNumber % vals.Length];
}
}