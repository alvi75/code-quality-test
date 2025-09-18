import java.util.*;

public class Translation157 {
    public long getObjectSize(AnyObjectId objectId, int typeHint) {
    try {
        long sz = getObjectSize(objectId);
        if (sizeHint != -1 && sz > sizeHint)throw new LargeObjectException(idObject.toObjectId(), sz, typeHint);
        return sz;
    }
    catch (IOException e) {
        throw new LargeObjectException(idObject.toObjectId(), e);
    }
}
}