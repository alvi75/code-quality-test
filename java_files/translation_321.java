import java.util.*;

public class Translationtranslation_321 {
    public ObjectStream openStream() {
        final WindowCursor wc = new WindowCursor(db);
        try {
            return new PackFile.ObjectStream(this, fc, wc);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            wc.close();
        }
    }
}