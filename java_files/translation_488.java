import java.util.*;

public class Translation488 {
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