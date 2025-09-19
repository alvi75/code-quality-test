import java.util.*;

public class Translation321 {
    public ObjectStream openStream() throws IOException {
    final WindowCursor wc = new WindowCursor(db);
    final InputStream in;
    try {
        in = new PackInputStream(wc.getObjectDatabase(), packFile, objectOffset+headerLength, OBJECTS_ID_LENGTH);
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
}
return new ObjectStream.SmallStream(in);
}
}