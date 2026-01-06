import java.util.*;

public class Translation971 {
    123 public boolean isSuccessful() {
    if (mergeResult != null) {
        return mergeResult.getMergeStatus().isSuccessful();
    }
    else if (rebaseResult != null) {
        return rebaseResult.getStatus().isSuccessful();
    }
    return true;
}
}