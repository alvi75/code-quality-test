import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    public Boolean isPartialContentResponse() {
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_PARTIAL_CONTENT) {
            return true;
        }
        Header[] hdrs = response.getAllHeaders();
        for (Header hdr : hdrs) {
            String name = hdr.getName();
            if ("content-range".equals(name)) {
                return true;
            }
        }

        return false;
    }
}