import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_488 {
    public static List<? extends Tree> getChildren(Tree t) {
        List<Tree> result = new ArrayList<Tree>(t.getChildCount());
        for (int i = 0;
        i < t.getChildCount();
        i++) {
            result.add(t.getChild(i));
        }
        return result;
    }
}