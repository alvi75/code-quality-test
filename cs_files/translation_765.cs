using System;
using System.Collections.Generic;

public class Translation765
{
    public override string ToQueryString(IEscapeQuerySyntax escaper){
    var children = GetChildren();
    if (children == null || children.Count == 0)return "";
    StringBuilder sb = new StringBuilder();
    string filler = "";
    foreach (IQueryNode child in children){
        sb.Append(filler).Append(child.ToQueryString(escaper));
        filler = " ";
    }
    if ((Parent != null && Parent is GroupQueryNode)|| IsRoot)return sb.ToString();
    elsereturn "( " + sb.ToString() + " )";
}
}