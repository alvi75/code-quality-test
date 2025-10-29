import java.util.*;

public class Translation236 {
    public Ref peel(Ref ref) throws IOException {
    try {
        return RefDatabase.peel(ref);
    }
    catch (IOException e) {
        return ref;
    }
}
}