using System;
using System.Collections.Generic;

public class Translation157
{
    public virtual long GetObjectSize(AnyObjectId objectId, int typeHint){
    try{
        return db.GetObjectSize(this, objectId, typeHint);
    }
    catch (MissingObjectException e){
        if (typeHint == OBJ_ANY){
            throw;
        }
        if (typeHint != -1){
            if (e.ObjectType != typeHint){
                throw;
            }
            return 0;
        }
        throw new InvalidObjectIdException(objectId.Copy(), JGitText.Get().invalidIdAndType, typeHint);
    }
}
}