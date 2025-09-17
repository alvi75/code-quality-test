import java.util.*;

public class Translationtranslation_321 {
    public ObjectStream openStream() throws IOException {
        final WindowCursor wc = new WindowCursor(db);
        final InputStream in;
        try {
            in = new PackInputStream(wc.getPackFile(), getDeltaSearchWindowSize());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new ObjectStream.SmallStream(wc, in);
    }
}