using System;
using System.Collections.Generic;

public class Translation236
{
    public virtual Ref Peel(Ref @ref){
    try{
        return GetRefDatabase().Peel(@ref);
    }
    catch (IOException e){
        return @ref;
    }
}
}