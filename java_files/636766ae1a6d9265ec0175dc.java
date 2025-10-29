import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    /**Determine whether the actual response is a Partial Content**/
    public Boolean isPartialContentResponse(){
        if (this.responseCode == 206) {
            return true;
        } else {
            return false;
        }
    }
}