import java.util.*;

public class Translationtranslation_702 {
    public void next(int delta) {
        while (--delta >= 0) {
            if (currentSubtree != null)nextSubtreePos(delta);
            elsenextDirPos(delta);
        }
    }
}