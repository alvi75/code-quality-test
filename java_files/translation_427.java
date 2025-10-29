import java.util.*;

public class Translation427 {
    ublic ListExclusionsResponse ListExclusions(ListExclusionsRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = ListExclusionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListExclusionsResponseUnmarshaller.Instance;
    return Invoke<ListExclusionsResponse>(request, options);
}
}