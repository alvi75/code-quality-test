import java.util.*;

public class Translation136 {
    ublic ErrorNode addErrorNode(Token badToken) {
    ErrorNodeImpl t = new ErrorNodeImpl(badToken);
    addChild(t);
    t.parent = this;
    return t;
}
}