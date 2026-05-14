import java.util.*;

public class Translation971 {
    public boolean isSuccessful() {
    if (mergeResult != null) {
        return mergeResult.getStatus().isSuccessful();
    }
    else if (rebaseResult != null) {
        return rebaseResult.getStatus().isSuccessful();
    }
    else {
        return true;
    }
}
}