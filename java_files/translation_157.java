import java.util.*;

public class Translation157 {
    public long getObjectSize(AnyObjectId id, int typeHint) throws IOException {
    long sz = db.getObjectSize(this, id);
    if (sz < 0) {
        if (typeHint == OBJ_ANY)throw new MissingObjectException(id.copy(), "unknown");
        throw new MissingObjectException(id.copy(), typeHint);
    }
    return sz;
}
}