import java.util.*;

public class Translation971 {
    1 public boolean isSuccessful() {
    2 if (mergeResult != null)3 return mergeResult.getMergeStatus().isSuccessful();
    4 else5 if (rebaseResult != null)6 return rebaseResult.getStatus().isSuccessful();
    7 return true;
}
}