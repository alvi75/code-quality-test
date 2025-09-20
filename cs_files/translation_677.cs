using System;
using System.Collections.Generic;

public class Translation677
{
    public override bool Equals(object o){
    if (this == o) return true;
    if (o == null || this.GetType() != o.GetType()) return false;
    FacetEntry other = (FacetEntry)o;
    if (count != other.count) return false;
    if (!value.Equals(other.value)) return false;
    return true;
}
}