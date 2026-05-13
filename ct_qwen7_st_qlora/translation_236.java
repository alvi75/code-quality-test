import java.util.*;

public class Translation236 {
    public Ref peel(Ref ref) throws IOException {
    try {
        return refDatabase.peel(ref);
    }
    catch (NoSuchObjectException | IncorrectObjectTypeException e) {
        throw new RuntimeException(e);
    }
}
}