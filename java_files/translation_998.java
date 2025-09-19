import java.util.*;

public class Translation998 {
    public Query getQuery(Element e) throws Parser eParseException {
    String text = DOMUtils.getText(e);
    try {
        Query q = null;
        if (unSafeParser != null) {
            synchronized (unSafeParser) {
                q = unSafeParser.parse(text);
            }
        }
}