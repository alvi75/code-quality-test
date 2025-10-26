import java.util.*;

public class Translation157 {
    ublic long getObjectSize(AnyObjectId objectId, int typeHint) {
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