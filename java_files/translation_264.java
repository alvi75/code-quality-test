import java.util.*;

public class Translation264 {
    public Token tget(int index) {
    Token t = token t = token t.next;
    for (int i = 0;
    i < index;
    i++) {
        if (t.next != null) t = t.next;
        else t = t.next = token(t);
    }
}
return t;
}
}