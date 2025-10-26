import java.util.*;

public class Translation10 {
    ublic ListIngestionsResponse ListIngestions(ListIngestionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListIngestionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListIngestionsResponseUnmarshaller.Instance;
    return Invoke<ListIngestionsResponse>(request, options);
}
}