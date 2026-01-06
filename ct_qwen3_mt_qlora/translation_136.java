import java.util.*;

public class Translation136 {
    1 public ErrorNode addErrorNode(Token badToken) {
    ErrorNodeImpl t = new ErrorNodeImpl(badToken);
    addChild(t);
    t.parent = this;
    return t;
}
}