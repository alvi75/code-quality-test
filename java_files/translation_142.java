import java.util.*;

public class Translation142 {
    public TreeFilter clone() {
    return new AndTreeFilter(Binary.clone(a), Binary.clone(b));
}
}