import java.util.*;

public class Translationtranslation_670 {
    public void setQuery(String query) {
        this.query = query;
        this.message = new MessageImpl(QueryParserMessages.INVALID_SYNTAX_CANNOT_PARSE, query, "");
    }
}