import java.util.*;

public class Translation157 {
    1 public long getObjectSize(AnyObjectId objectId, int typeHint) throws IOException {
    2 final long sz = db.getObjectSize(this, objectId);
    3 if (sz < 0) {
        4 if (typeHint == OBJ_ANY)5 throw new MissingObjectException(objectId.copy(), "unknown");
        6 throw new MissingObjectException(objectId.copy(), typeHint);
        7 }
        8 return sz;
    }
}