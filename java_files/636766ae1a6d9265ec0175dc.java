import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    /**
     * Determine whether the actual response is a Partial Content**/
    public Boolean isPartialContentResponse(){
        if (response == null) {
            return false;
        }
        String header = response.getHeader(HttpHeaders.CONTENT_RANGE);
        if (header != null && !header.isEmpty()) {
            return true;
        }

        header = response.getHeader(HttpHeaders.RANGE);
        if (header != null && !header.isEmpty()) {
            return true;
        }

        return false;
    }
}