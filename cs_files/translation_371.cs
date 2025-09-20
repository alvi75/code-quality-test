using System;
using System.Collections.Generic;

public class Translation371
{
    public override string ToString(){
    var children = GetChildren();
    if (children == null || children.Count == 0)return "<boolean operation='or'/>";
    StringBuilder sb = new StringBuilder();
    sb.Append("<boolean operation='or'>");
    foreach (IQueryNode child in children){
        sb.Append("\n");
        sb.Append(child.ToString());
    }
    sb.Append("\n</boolean>");
    return sb.ToString();
}
}