using System;
using System.Collections.Generic;

public class Translation892
{
    public override bool Equals(object obj){
    State other = (State)obj;
    return IsFinal == other.IsFinal && Arrays.Equals(Labors, other.Labors);
}
}