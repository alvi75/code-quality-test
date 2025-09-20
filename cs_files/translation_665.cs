using System;
using System.Collections.Generic;

public class Translation665
{
    public override string ToString(){
    StringBuilder r = new StringBuilder();
    r.Append("BlameResult: ");
    r.Append(GetResultPath());
    r.Append(" -> ");
    r.Append(GetNewPath());
    r.Append(" (");
    r.Append(OldId == null ? string.Empty : OldId.Abbreviate(7).Name);
    r.Append(',');
    r.Append(NewId == null ? string.Empty : NewId.Abbreviate(7).Name);
    r.Append(')');
    if (GetNewPath() != null){
        r.Append(' ');
        r.Append(GetNewPath());
    }
    return r.ToString();
}
}