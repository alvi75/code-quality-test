import java.util.*;

public class Translation236 {
    public Ref peel(Ref ref) {
    try {
        return refDatabase.peel(ref);
    }
    catch (IOException e) {
        return ref;
    }
}
}