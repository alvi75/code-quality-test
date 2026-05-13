import java.util.*;

public class Translation157 {
    public long getObjectSize(ObjectId objectId, int typeHint)throws MissingObjectException, IncorrectObjectTypeException,IOException {
    final long sz = database.getObjectSize(this, objectId);
    if (sz < 0) {
        if (typeHint == OBJ_ANY)throw new MissingObjectException(objectId.copy(), "unknown");
        throw new MissingObjectException(objectId.copy(), typeHint);
    }
    if (typeHint != OBJ_ANY && typeHint != getType())throw new IncorrectObjectTypeException(getType(), object.getType());
    return sz;
}
}