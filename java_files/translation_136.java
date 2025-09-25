import java.util.*;

public class Translation136 {
    public ErrorNode addErrorNode(Token badToken) {
    ErrorNodeImpl t = new ErrorNodeImpl(badToken);
    addChildren(t);
    t.setParent(this);
    return t;
}
}