import java.util.*;

public class Translation136 {
    ublic ErrorNode AddErrorNode(IToken badToken) {
    ErrorNodeImpl t = new ErrorNodeImpl(badToken);
    addChild(t);
    t.setParent(this);
    return t;
}
}