using System;
using System.Collections.Generic;

public class Translation488
{
    public static IList<ITree> GetChildren(ITree t){
    IList<ITree> kids = new List<ITree>();
    for (int i = 0;
    i < t.ChildCount;
    i++){
        kids.Add(t.GetChild(i));
    }
    return kids;
}
}