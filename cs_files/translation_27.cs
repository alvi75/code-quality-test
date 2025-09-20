using System;
using System.Collections.Generic;

public class Translation27
{
    public override bool Equals(object obj){
    if (!(obj is FacetLabel)){
        return false;
    }
    FacetLabel other = (FacetLabel)obj;
    if (Length != other.Length){
        return false;
    }
    for (int i = Length - 1;
    i >= 0;
    i--){
        if (!Components[i].Equals(other.Components[i])){
            return false;
        }
    }
    return true;
}
}