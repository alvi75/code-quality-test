import java.util.*;

public class Translationtranslation_157 {
    public long getObjectSize(AnyObjectId objectId, int typeHint) {
        try {
            long sz = getObjectSize(objectId);
            if (sizeHint <= sz) {
                if (typeHint == OBJ_ANY || (typeHint != OBJ_ANY && typeHint == sz)) {
                    return sz;
                }
            }
            throw new IncorrectObjectTypeException(objectId.copy(), typeHint);
        }
        catch (IOException e) {
            throw new InvalidObjectIdException(objectId.copy(), e);
        }
    }
}