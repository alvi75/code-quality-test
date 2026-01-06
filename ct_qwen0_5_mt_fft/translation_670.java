import java.util.*;

public class Translation670 {
    public void setQuery(String query) {
    this.query = query;
    this.message = new Message(QUERY_INVALID_SYNTAX_CANNOT_PARSE, query, "");
}
}