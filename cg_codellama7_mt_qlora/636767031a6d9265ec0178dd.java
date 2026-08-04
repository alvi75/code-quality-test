import java.util.*;

public class Generated_636767031a6d9265ec0178dd {
    public long contentLength() {
        String contentLength = getFirstHeader(HttpHeaders.Names.CONTENT_LENGTH);
        if (contentLength == null) {
            return -1;
        }
        try {
            return Long.parseLong(contentLength);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}