import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    public Boolean isPartialContentResponse(){
        if (this.actualResponse instanceof HttpEntity) {
            return ((HttpEntity) this.actualResponse).isPartialContent();
        } else {
            return null;
        }
    }
}