using System;
using System.Collections.Generic;

public class Translation724
{
    public override DiffEntry CompareTo(DiffEntry other){
    if (other == null){
        throw new ArgumentException("other must not be null");
    }
    if (this == other){
        return DiffEntry.NO_CHANGE;
    }
    int compare = CompareTo(other);
    if (compare < 0){
        return LessThan(other);
    }
    else if (compare > 0){
        return GreaterThan(other);
    }
    else{
        if (this.Boost == other.Boost){
            return CompareTo(other);
        }
        else{
            return this.Boost.CompareTo(other.Boost);
        }
    }
}
}