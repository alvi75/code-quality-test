import java.util.*;

public class Translation236 {
    public Ref peel(Ref ref) {
    try {
        return ref.getPeeledObjectId() != null ? ref.getPeeledObject() : ref;
    }
    catch (IOException e) {
        throw new JGitInternalException(e.getMessage(), e);
    }
}
}