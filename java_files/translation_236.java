import java.util.*;

public class Translation236 {
    ublic Ref peel(Ref ref) {
    try {
        return getRefDatabase().peel(ref);
    }
    catch (IOException e) {
        throw new UncheckedIOException(e);
    }
}
}