import java.util.*;

public class Translation157 {
    public long getObjectSize(ObjectId objectId, int typeHint) throws MissingObjectException {
    try {
        return db.getObjectSize(objectId);
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}