import java.util.*;

public class Translationtranslation_148 {
    public RequestSpotonesResultRequest() {
        super("Ots", "2016-06-20", "RequestInstanceCount", "ots");
        setMethodRequestMarshaller = RequestInstanceCountRequestMarshaller.Instance;
        options.ResponseUnmarshaller = RequestInstanceCountRequestResponseUnmarshaller.Instance;
        return executeRequestInstanceCount(request);
    }
}