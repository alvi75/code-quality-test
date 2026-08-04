import java.util.*;

public class Translation670 {
    public void setQuery(String query) {
    this.query = query;
    this.m_message = new Message(QueryParserMessages.INVALID_SYNTAX_CANNOT_PARSE, query, "");
}
}