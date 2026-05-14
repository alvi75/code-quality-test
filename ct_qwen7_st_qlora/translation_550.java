import java.util.*;

public class Translation550 {
    public String toString() {
    return "spans(" + term.toString() + ")@" + (doc==NO_DOC? "START" : (end==NO_END)? "END" : doc + "-" + end);
}
}