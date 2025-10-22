import java.util.*;

public class Translation264 {
    ublic Token getToken(int index) {
    Token t = token;
    for (int i = 0;
    i < index;
    i++) {
        if (t.next != null) t = t.next;
        else t = t.next = tokenSource.getNextToken();
    }
    return t;
}
}