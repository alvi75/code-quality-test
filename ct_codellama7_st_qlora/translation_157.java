import java.util.*;

public class Translation157 {
    public long getObjectSize(AnyObjectId objectId, int typeHint)throws MissingObjectException, IOException {
    long sz = db.getObjectSize(this, objectId);
    if (sz < 0) {
        if (typeHint == OBJ_ANY)throw new MissingObjectException(objectId, "unknown");
        throw new MissingObjectException(objectId, typeHint);
    }
    return sz;
}
}