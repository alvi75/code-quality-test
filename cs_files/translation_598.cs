using System;
using System.Collections.Generic;

public class Translation598
{
    public virtual ObjectIdSubclassMap<ObjectId> GetBaseObjectIds(){
    if (baseObjectIds != null){
        return baseObjectIds;
    }
    return new ObjectIdSubclassMap<ObjectId>();
}
}