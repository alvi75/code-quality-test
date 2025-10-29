import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    public Boolean isPartialContentResponse(){
        if (response != null && response.getStatus() == HttpStatus.PARTIAL_CONTENT){
            return true;
        }
        return false;
    }
}