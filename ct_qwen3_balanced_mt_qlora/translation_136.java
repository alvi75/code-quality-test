import java.util.*;

public class Translation136 {
    ublic void addErrorNode(Token badToken) {
    ErrorNodeImpl t = new ErrorNodeImpl(badToken);
    addChild(t);
    t.setParent(this);
}
}