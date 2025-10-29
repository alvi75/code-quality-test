import java.util.*;

public class Translation264 {
    01 public Token getToken(int index) {
    02 Token t = token;
    03 for (int i = 0;
    i < index;
    i++) {
        04 if (t.next != null) t = t.next;
        05 else t = t.next = tokenSource.getNextToken();
        06 }
        07 return t;
    }
}