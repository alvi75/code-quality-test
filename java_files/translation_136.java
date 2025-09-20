import java.util.*;

public class Translation136 {
    public ErrorNode addErrorNode(Token badToken) {
    ErrorNodeImpl t = new ErrorNodeImpl(badToken);
    addChild(t);
    t.setParent(this);
    return t;
}
}