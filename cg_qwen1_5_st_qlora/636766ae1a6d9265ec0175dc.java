import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    /**
 * Determine whether the actual response is a Partial Content**/
    public Boolean isPartialContentResponse(){
        if (response == null) {
            return false;
        }
        String contentRange = response.getHeader(HttpHeaderNames.CONTENT_RANGE);
        if(contentRange != null && contentRange.contains("bytes")){
            return true;
        } else {
            return false;
        }
    }
}