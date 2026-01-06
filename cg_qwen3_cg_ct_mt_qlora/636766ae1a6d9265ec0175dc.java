import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    public Boolean isPartialContentResponse(){
        if (response != null) {
            return response.getStatusLine().getStatusCode() == HttpStatus.SC_PARTIAL_CONTENT;
        }
        return false;
    }
}