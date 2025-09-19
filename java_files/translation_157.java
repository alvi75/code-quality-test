import java.util.*;

public class Translation157 {
    public long getObjectSize(ObjectId objectId, int typeHint)throws LargeObjectException,MissingObjectException {
    final long sz = db.getObjectSize(this, objectId);
    if (sz < 0) {
        if (typeHint == OBJ_ANY)throw new MissingObjectException(objectId.copy(),JGitText.get().unknownObjectType2);
        throw new MissingObjectException(objectId.copy(), typeHint);
    }
    objectInserter.setCallable(false);
    try {
        return objectInserter.getSize(objectId);
    }
    objectReader.close();
}
catch (IOException e) {
    throw new JGitInternalException(e.getMessage(), e);
}
}
}