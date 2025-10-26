import java.util.*;

public class Translation82 {
    ublic ListMonitoringExecutionsResponse ListMonitoringExecutions(ListMonitoringExecutionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListMonitoringExecutionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListMonitoringExecutionsResponseUnmarshaller.Instance;
    return Invoke<ListMonitoringExecutionsResponse>(request, options);
}
}