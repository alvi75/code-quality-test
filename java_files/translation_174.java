import java.util.*;

public class Translation174 {
    ublic GetOperationsResponse GetOperations(GetOperationsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetOperationsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetOperationsResponseUnmarshaller.Instance;
    return Invoke<GetOperationsResponse>(request, options);
}
}