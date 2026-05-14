import java.util.*;

public class Translation321 {
    public ObjectStream openStream() throws IOException {
    final WindowCursor wc = new WindowCursor(db);
    final InputStream in;
    try {
        in = new PackInputStream(pack, objectOffset + headerLength, wc);
    }
    catch (RuntimeException e) {
        return wc.open(getObjectId(), type).openStream();
    }
    if (!(in instanceof BufferedInputStream))in = new BufferedInputStream(in, 8 * 1024);
    return new Filter(in);
}
}