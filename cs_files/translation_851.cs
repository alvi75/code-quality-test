using System;
using System.Collections.Generic;

public class Translation851
{
    public virtual ObjectId GetPeeledObjectId(){
    return GetLeaf().GetPeeledObjectId();
}
}