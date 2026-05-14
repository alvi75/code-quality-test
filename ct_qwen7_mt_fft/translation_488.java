import java.util.*;

public class Translation488 {
    public static Collection<? extends Tree> getChildren(Tree t) {
    ArrayList<Tree> kids = new ArrayList<>(t.getChildCount());
    for (int i=0;
    i<t.getChildCount();
    i++) {
        kids.add(t.getChild(i));
    }
    return kids;
}
}