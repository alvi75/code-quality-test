import java.util.*;

public class Translation321 {
    public ObjectStream openStream() {
    final WindowCursor wc = new WindowCursor(db);
    InputStream in;
    try {
        in = new PackInputStream(pack.openStream(), getDeltaBaseCache(),objectOffset+headerLength, wc);
    }
    catch (IOException e) {
        return wc.open(getObjectId(), getType()).openStream();
    }
    in = new BufferedInputStream(in, 8192);
    return new ObjectStreamFilter(type, getSize(), in);
}
}