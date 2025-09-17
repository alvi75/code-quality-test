import java.util.*;

public class Translationtranslation_971 {
    public boolean isSuccessful() {
        if (mergeResult != null) {
            return mergeResult.getMergeStatus().isSuccessful();
        }
        else if (rebaseResult != null) {
            return rebaseResult.getStatus().isSuccessful();
        }
        else {
            return true;
        }
    }
}