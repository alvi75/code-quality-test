import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    public Boolean isPartialContentResponse(){
        if (this.statusCode == 206) {
            return true;
        }
        else if (this.statusCode >= 300 && this.statusCode < 400){
            return false;
        }
        else{
            throw new CitrusRuntimeException("Unsupported status code for partial content response: " + this.statusCode);
        }
    }
}