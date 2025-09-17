import java.util.*;

public class Translationtranslation_264 {
    public Token getToken(int index) {
        Token t = token;
        for (int i = 0;
        i < index;
        i++) {
            if (t.next != null) t = t.next;
            else t = t.next = token_source.getNextToken();
        }
        return t;
    }
}