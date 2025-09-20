using System;
using System.Collections.Generic;

public class Translation46
{
    public virtual void SetProgressMonitor(ProgressMonitor pm){
    this.pm = (pm == null) ? NullProgressMonitor.INSTANCE : pm;
}
}