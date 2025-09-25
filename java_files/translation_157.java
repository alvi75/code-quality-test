import java.util.*;

public class Translation157 {
    public long getObjectSize(AnyObjectId objectId, int typeHint)throws MissingObjectException {
    try {
        return db.getObjectSize(this, objectId);
    }
    catch (IOException e) {
        throw new MissingObjectException(objectId.copy(), typeHint, e);
    }
}
}