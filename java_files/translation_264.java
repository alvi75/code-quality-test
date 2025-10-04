import java.util.*;

public class Translation264 {
    public final Token getToken(int index) {
    Token t = token;
    for (int i = 0;
    i < index;
    i++) {
        if (t.next != null) t = t.next;
        else t = t.next = token_source.getNextToken();
    }
    return t;
}
Create a new class called "Person" with properties for "firstName", "lastName", and "age". Implement a constructor that initializes these properties, and also provide a method to get the full name (first name concatenated with last name).
}