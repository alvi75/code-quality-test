import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    /**
 * Determine whether the actual response is a Partial Content
 **/
    public Boolean isPartialContentResponse(){
        if (this.response != null && this.response.getStatus() == HttpStatus.PARTIAL_CONTENT.getStatusCode()){
            return true;
        }
        return false;
    }
}