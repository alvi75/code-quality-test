import java.util.*;

public class Translation321 {
    public ObjectStream openStream() {
    final WindowCursor wc = new WindowCursor(db);
    final InputStream in;
    try {
        in = new PackInputStream(wc);
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
    in = new BufferedInputStream(in, 8192);
    return new ObjectStream.Filter(type, size, in);
}
}