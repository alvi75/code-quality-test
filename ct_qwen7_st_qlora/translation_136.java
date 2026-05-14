import java.util.*;

public class Translation136 {
    public ErrorNode addErrorNode(Token badToken) {
    ErrorNode t = new ErrorNode(badToken);
    addChild(t);
    t.setParent(this);
    return t;
}
}