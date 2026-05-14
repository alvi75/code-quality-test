import java.util.*;

public class Translation136 {
    1 public IErrorNode addErrorNode(Token badToken) {
    2 final ErrorNodeImpl t = new ErrorNodeImpl(badToken);
    3 addChild(t);
    4 t.parent = this;
    5 return t;
}
}