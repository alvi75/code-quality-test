import java.util.*;

public class Translation264 {
    public final Token getToken(int index) {
    Token t = token;
    for (int i = 0;
    i < index;
    i++) {
        if (t.next != null) t = t.next;
        else t = t.nextToken();
    }
    return t;
}
}