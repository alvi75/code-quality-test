import java.util.*;

public class Translation670 {
    public void setQuery(String query) {
    this.query = query;
    this.message = new Message(Message.IMPLICIT_QUERY_INVALID_SYNTAX, query);
}
}