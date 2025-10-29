import java.util.*;

public class Translation382 {
    ublic DeleteStackSetResponse DeleteStackSet(DeleteStackSetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteStackSetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteStackSetResponseUnmarshaller.Instance;
    return Invoke<DeleteStackSetResponse>(request, options);
}
}