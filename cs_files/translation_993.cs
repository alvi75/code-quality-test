using System;
using System.Collections.Generic;

public class Translation993
{
    public override string ToString(){
    StringBuilder s = new StringBuilder();
    s.Append(Constants.TypeString(Type));
    s.Append(' ');
    s.Append(Name);
    s.Append(' ');
    s.Append(CommitTime);
    s.Append(' ');
    AppendCoreFlags(s);
    return s.ToString();
}
}