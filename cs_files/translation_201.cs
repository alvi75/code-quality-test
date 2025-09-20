using System;
using System.Collections.Generic;

public class Translation201
{
    public virtual RebaseCommand.RebaseResult GetRebaseResult(){
    return this._enclosing.result;
}
}