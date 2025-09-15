import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_488 {
    public static List<? extends Tree> getChildren(Tree t) {
        List<Tree> kids = new ArrayList<Tree>();
        for (int i = 0;
        i < t.getChildCount();
        i++) {
            kids.add(t.getChild(i));
        }
        return kids;
    }
}