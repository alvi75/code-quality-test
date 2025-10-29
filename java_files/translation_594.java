import java.util.*;

public class Translation594 {
    ublic ListComponentsResponse ListComponents(ListComponentsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListComponentsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListComponentsResponseUnmarshaller.Instance;
    return Invoke<ListComponentsResponse>(request, options);
}
}