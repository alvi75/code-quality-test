import java.util.*;

public class Translation488 {
    public static List<ITree> getChildren(ITree t) {
    List<ITree> kids = new ArrayList<>();
    for (int i = 0;
    i < t.getChildCount();
    i++) {
        kids.add(t.getChildAt(i));
    }
    return kids;
}
}