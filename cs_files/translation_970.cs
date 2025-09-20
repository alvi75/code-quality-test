using System;
using System.Collections.Generic;

public class Translation970
{
    public override String ToString(){
    StringBuilder sb = new StringBuilder();
    sb.Append("[SXPI]\n");
    for (int i = 0;
    i < fieldInfos.Length;
    i++){
        sb.Append(" .").Append(fieldInfos[i].Name).Append(" = ").Append(fieldInfos[i].Value).Append("\n");
    }
    sb.Append("[/SXPI]\n");
    return sb.ToString();
}
}