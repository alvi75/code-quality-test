using System;
using System.Collections.Generic;

public class Translation280
{
    public virtual void IncrementSecondaryProgressBy(int diff){
    lock (this){
        SetSecondaryProgress(mSecondaryProgress + diff);
    }
}
}