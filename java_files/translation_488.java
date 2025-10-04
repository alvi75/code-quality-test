import java.util.*;

public class Translation488 {
    public static List<? extends Tree> getChildren(Tree t) {
    List<Tree> kids = new ArrayList<>(2);
    for (int i = 0;
    i < t.getChildCount();
    i++) {
        kids.add(t.getChild(i));
    }
    return kids;
}
Create a function to calculate the sum of all elements in a given list. Preserve semantics, be idiomatic in the target language, and output only the translated code—no explanations.
}