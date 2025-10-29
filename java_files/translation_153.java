import java.util.*;

public class Translation153 {
    ublic GetContactMethodsResult GetContactMethods(GetContactMethodsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetContactMethodsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetContactMethodsResponseUnmarshaller.Instance;
    return Invoke<GetContactMethodsResult>(request, options);
}
}