import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    /**
 * Determine whether the actual response is a Partial Content
 */
public Boolean isPartialContentResponse(){
        if (response != null){
            return response.getStatusLine().getStatusCode() == HttpStatus.SC_PARTIAL_CONTENT;
        }
        return false;
    }
}