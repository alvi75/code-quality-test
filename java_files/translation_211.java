import java.util.*;

public class Translation211 {
    ublic ListAssociatedStacksResponse ListAssociatedStacks(ListAssociatedStacksRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListAssociatedStacksRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListAssociatedStacksResponseUnmarshaller.Instance;
    return Invoke<ListAssociatedStacksResponse>(request, options);
}
}