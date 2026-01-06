import java.util.*;

public class Translation321 {
    public InputStream openStream() throws IOException {
    WindowCursor wc = new WindowCursor(db);
    InputStream in;
    try {
        in = new PackInputStream(pack, objectOffset + headerLength, wc);
    }
    catch (IOException e) {
        return wc.open(getObjectId(), type).openStream();
    }
    finally {
        if (in != null) {
            try {
                in.close();
            }
            catch (IOException e) {
            }
        }
    }
}