using System;
using System.Collections.Generic;

public class Translation827
{
    public override bool Equals(object other){
    var otherG = (MergedGroup<?>)other;
    if (groupValue == null){
        return otherG == null;
    }
    else{
        return groupValue.Equals(otherG.groupValue);
    }
}
}