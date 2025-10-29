import java.util.*;

public class Translation321 {
    public ObjectStream openStream() {
    WindowCursor wc = new WindowCursor(this.db);
    InputStream in;
    try {
        in = new PackInputStream(this.pack, this.objectOffset + this.headerLength, wc);
    }
    catch (IOException e) {
        return wc.open(getObjectId(), type).openStream();
    }
    else {
        return new BufferedInputStream(new InflaterInputStream(in, wc.getInflater(), 8192),8192);
    }
}