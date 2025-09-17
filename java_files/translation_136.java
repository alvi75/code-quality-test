import java.util.*;

public class Translationtranslation_136 {
    public ErrorNode addErrorNode(Token badToken) {
        ErrorNodeImpl t = new ErrorNodeImpl(badToken);
        addNode(t);
        t.setParent(this);
        return t;
    }
}