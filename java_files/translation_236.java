import java.util.*;

public class Translation236 {
    public Ref peel(Ref ref) {
    try {
        return getDatabase().peel(ref);
    }
    catch (IOException e) {
        throw new UncheckedIOException(e);
    }
}
}