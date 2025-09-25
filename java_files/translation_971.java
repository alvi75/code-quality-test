import java.util.*;

public class Translation971 {
    public boolean isSuccessful() {
    if(mergeResult!=null) return mergeResult.getMergeStatus().isSuccessful();
    elsereturn rebaseResult.getStatus().isSuccessful();
}
}