import java.util.*;

public class Translation971 {
    ublic boolean isSuccessful() {
    if (mergeResult != null) {
        return mergeResult.getMergeStatus().isSuccessful();
    }
    else if (rebaseResult != null) {
        return rebaseResult.getStatus().isSuccessful();
    }
}
}