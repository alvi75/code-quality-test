import java.util.*;

public class Translation321 {
    public ObjectStream openStream() {
    final WindowCursor wc = new WindowCursor(db);
    ObjectInputStream in = null;
    try {
        in = new PackInputStream(pack, objectOffset + headerLength, wc);
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
    in = new BufferedInputStream(in, 8192);
    return new ObjectStream.Filter(in, type, size);
}
}