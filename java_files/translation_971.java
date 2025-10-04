import java.util.*;

public class Translation971 {
    public boolean isSuccessful() {
    if (mergeResult != null)return mergeResult.isSuccessful();
    if (rebaseResult != null)return rebaseResult.isSuccessful();
    return true;
}
}