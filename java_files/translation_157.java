import java.util.*;

public class Translation157 {
    public long getObjectSize(AnyObjectId objectId, int typeHint) throws MissingObjectException, IncorrectObjectTypeException, IOException {
    final long sz = db.getObjectSize(this, objectId);
    if (sz < 0) {
        if (typeHint == OBJ_ANY)throw new MissingObjectException(objectId.copy(),JGitText.get().unknownObjectType2);
        throw new MissingObjectException(objectId.copy(), typeHint);
    }
    return sz;
}
}