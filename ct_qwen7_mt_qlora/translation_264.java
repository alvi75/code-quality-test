import java.util.*;

public class Translation264 {
    1 public Token getToken(int index) {
    2 Token t = token;
    3 for (int i = 0;
    i < index;
    i++) {
        4 if (t.next != null)5 t = t.next;
        6 else7 t = t.next = tokenSource.nextToken();
        8 }
        9 return t;
    }
}