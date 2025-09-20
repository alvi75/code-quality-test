using System;
using System.Collections.Generic;

public class Translation245
{
    public override bool Equals(object obj){
    if (this == obj){
        return true;
    }
    if (obj == null){
        return false;
    }
    if (this.GetType() != obj.GetType()){
        return false;
    }
    Toffs other = (Toffs)obj;
    if (StartOffset != other.StartOffset){
        return false;
    }
    if (EndOffset != other.EndOffset){
        return false;
    }
    return true;
}
}