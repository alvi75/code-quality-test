using System;
using System.Collections.Generic;

public class Translation136
{
    public virtual IErrorNode AddErrorNode(IToken badToken){
    IErrorNodeImpl t = new IErrorNodeImpl(badToken);
    AddChild(t);
    t.Parent = this;
    return t;
}
}