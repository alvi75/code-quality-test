import java.util.*;

public class Translation157 {
    public long getObjectSize(AnyObjectId objectId, int typeHint)throws IOException {
    final long sz = db.getObjectSize(this, objectId);
    if (sz < 0)throw new MissingObjectException(objectId.copy(), typeHint);
    return sz;
}
}