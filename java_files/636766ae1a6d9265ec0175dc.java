import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    public Boolean isPartialContentResponse(){
        if (responseCode == 206) {
            return true;
        }
        else if (responseCode == 304) {
            return true;
        }
        else if (responseCode == 416) {
            return true;
        }
        else if (responseCode == 504) {
            return true;
        }
        return false;
    }
}