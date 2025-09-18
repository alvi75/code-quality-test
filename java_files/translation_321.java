import java.util.*;

public class Translation321 {
    public ObjectStream openStream() {
    final WindowCursor wc = new WindowCursor(db);
    final InputStream in;
    try {
        in = new PackInputStream(packFile, db.getInputStream(), objectToPack);
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
    final ObjectStream out = new ObjectStreamImpl(in, objectToPack);
    final String id = out.getId();
    assert id.length() == Constants.OBJECT_ID_LENGTH: "ObjectID=" + id;
    return out;
}
}