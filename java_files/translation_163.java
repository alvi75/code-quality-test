import java.util.*;

public class Translation163 {
    ublic ReportInstanceStatusResponse ReportInstanceStatus(ReportInstanceStatusRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ReportInstanceStatusRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ReportInstanceStatusResponseUnmarshaller.Instance;
    return Invoke<ReportInstanceStatusResponse>(request, options);
}
}