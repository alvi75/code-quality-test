import java.util.*;

public class Translation348 {
    ublic virtual ActivateEventSourceResponse ActivateEventSource(ActivateEventSourceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ActivateEventSourceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ActivateEventSourceResponseUnmarshaller.Instance;
    return Invoke<ActivateEventSourceResponse>(request, options);
}
}