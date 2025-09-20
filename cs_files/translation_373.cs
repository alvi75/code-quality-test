using System;
using System.Collections.Generic;

public class Translation373
{
    public virtual void SetReadonly(bool readonly){
    if (this.m_readonly && !readonly){
        throw new InvalidOperationException("can't alter readonly IntervalSet");
    }
    this.m_readonly = readonly;
}
}