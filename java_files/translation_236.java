import java.util.*;

public class Translationtranslation_236 {
    public Ref peel(Ref ref) {
        try {
            return RefDatabase.getPeeled(ref);
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}