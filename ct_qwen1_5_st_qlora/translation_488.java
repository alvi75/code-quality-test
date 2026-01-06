import java.util.*;

public class Translation488 {
    public static List<? extends Tree> getChildren(Tree t) {
    List<Tree> kids = new ArrayList<>();
    for (int i = 0;
    i < t.getChildCount();
    i++) {
        kids.add(t.getChild(i));
    }
    return kids;
}
}