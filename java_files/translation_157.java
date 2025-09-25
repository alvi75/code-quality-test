import java.util.*;

public class Translation157 {
    public long getObjectSize(ObjectId objectId, int typeHint) {
    long sz = db.getObjectSize(this, objectId);
    if (sz < 0) {
        if (typeHint == OBJ_ANY) {
            throw new MissingObjectException(objectId.copy(), "unknown");
        }
        throw new MissingObjectException(objectId.copy(), typeHint);
    }
    return sz;
}
}