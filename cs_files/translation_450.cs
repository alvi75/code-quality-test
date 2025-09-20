using System;
using System.Collections.Generic;

public class Translation450
{
    public virtual ObjectIdSubclassMap<ObjectId> GetNewObjectIds(){
    if (newObjectIds != null){
        return newObjectIds;
    }
    return new ObjectIdSubclassMap<ObjectId>();
}
}