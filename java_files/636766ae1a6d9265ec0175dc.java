import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    public Boolean isPartialContentResponse(){
        if (actualResponse != null && actualResponse.get() != null) {
            return ((AbstractHttp2ToHttpClientConnection) actualResponse.get()).isPartialContentResponse();
        }
        return false;
    }
}