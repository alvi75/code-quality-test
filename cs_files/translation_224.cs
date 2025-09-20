using System;
using System.Collections.Generic;

public class Translation224
{
    public static string ToStringTree(ITree t){
    string[] nodes = new string[1];
    bool[] isLeaf = new bool[1];
    int i = 0;
    while (t != null){
        nodes[i++] = t.NodeName;
        if (isLeaf[i] = t.IsLeaf){
            i++;
        }
        t = t.Parent;
    }
    return Utils.Join("\n", nodes) + "\n";
}
}