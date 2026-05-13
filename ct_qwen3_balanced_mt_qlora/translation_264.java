import java.util.*;

public class Translation264 {
    128 public Token getToken(int index) {
    Token t = token;
    for (int i = 0;
    i < index;
    i++) {
        if (t.next != null) t = t.next;
        elset = token = token.next;
    }
    return t;
}
}