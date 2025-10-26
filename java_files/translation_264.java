import java.util.*;

public class Translation264 {
    ublic Token get(int index) {
    Token t = token;
    for (int i = 0;
    i < index;
    i++) {
        if (t.next != null) t = t.next;
        else t = t.next = getTokenSource().getNextToken();
    }
    return t;
}
}