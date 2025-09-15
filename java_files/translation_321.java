import java.util.*;

public class Translationtranslation_321 {
    public ObjectStream openStream() throws IOException {
        final WindowCursor wc = new WindowCursor(db);
        final InputStream in;
        try {
            in = new PackIndexInput(wc, packFile);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        final ObjectStream out = new ObjectStreamImpl(in, wpOff, hiOff);
        final String tmpFile = Files.createTempFile(null, OBJECTS_EXTENSION);
        try (FileChannel fc = open(tempFile)) {
            final long len = fc.length();
            if (len != expectedSize) {
                throw new CorruptObjectException(MessageFormat.format(JGitText.get().corruptObject, len, expectedSize));
            }
            return out;
        }
    }
}