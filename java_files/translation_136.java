import java.util.*;

public class Translation136 {
    public ErrorNode addChild(Token badToken) {
    ErrorNodeImpl t = new ErrorNodeImpl(badToken);
    addAnyChild(t);
    t.setParent(this);
    return t;
}
}