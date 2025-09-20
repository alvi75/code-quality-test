using System;
using System.Collections.Generic;

public class Translation723
{
    public virtual void incrementProgressBy(int diff){
    lock (this){
        setProgress(mProgress + diff);
    }
}
}