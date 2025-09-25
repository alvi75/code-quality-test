import java.util.*;

public class Translation236 {
    public Ref peel(Ref ref) throws IOException {
    try {
        return refDatabase.peel(ref);
    }
    catch (IOException e) {
        throw new UncheckedIOException(e);
    }
}
}