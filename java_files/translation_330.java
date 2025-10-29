import java.util.*;

public class Translation330 {
    0;
int mismatchedNodeIndex = -1;
for (int i = 0;
i < tree.ChildCount;
i++){
    if (tree.GetChild(i) == mismatchedNode){
        mismatchedNodeIndex = i;
        break;
    }
}
return new ParseTreeMatch(tree, pattern, labels, mismatchedNodeIndex);
}
}