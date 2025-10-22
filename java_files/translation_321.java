import java.util.*;

public class Translation321 {
    public ObjectStream openStream() throws IOException {
    WindowCursor wc = new WindowCursor(db);
    InputStream in;
    try {
        in = new PackInputStream(pack, objectOffset + headerLength, wc);
    }
    catch (IOException e) {
        return wc.open(getObjectId(), type).openStream();
    }
    in = new BufferedInputStream(new InflaterInputStream(in, wc.getInflater(), 8192), 8192);
    return new ObjectStream.Filter(type, size, in);
}
}