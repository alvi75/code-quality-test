import java.util.*;

public class Translationtranslation_236 {
    public Ref peel(Ref ref) {
        try {
            return getRefDatabase().peel(ref);
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}