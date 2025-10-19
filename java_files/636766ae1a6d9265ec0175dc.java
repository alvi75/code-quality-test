import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    public Boolean isPartialContentResponse() {
        if (this.response == null) {
            return false;
        }
        String contentRange = this.response.getHeader(HttpHeaderNames.CONTENT_RANGE);
        if (contentRange != null && contentRange.contains("bytes")) {
            return true;
        } else {
            return false;
        }
    }
}