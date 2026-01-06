import java.util.*;

public class Translation321 {
    public ObjectStream openStream() throws IOException {
    final WindowCursor wc = new WindowCursor(db);
    InputStream in;
    try {
        in = new PackInputStream(pack, objectOffset + headerLength, wc);
    }
    catch (IOException err) {
        throw err;
    }
    catch (InterruptedIOException err) {
        IOUtils.closeWhileHandlingException(wc);
        throw err;
    }
    catch (RuntimeException err) {
        IOUtils.closeWhileHandlingException(wc);
        throw err;
    }
    finally {
        IOUtils.closeWhileHandlingException(in);
    }
    return new ObjectStream.Filter(type, size, in);
}
}