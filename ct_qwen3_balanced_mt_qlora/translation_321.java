import java.util.*;

public class Translation321 {
    ublic ObjectStream openStream() throws IOException {
    final WindowCursor wc = new WindowCursor(db);
    final InputStream in;
    try {
        in = new PackInputStream(pack, objectOffset + headerLength, wc);
    }
    catch (IOException e) {
        return wc.open(getObjectId(), type).openStream();
    }
    in = new BufferedInputStream(new InflaterInputStream(in, wc.getInflater()), 8192);
    return new ObjectStream.Filter(type, size, in);
}
}