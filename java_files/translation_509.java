import java.util.*;

public class Translation509 {
    ublic ResumeProcessesResponse ResumeProcesses(ResumeProcessesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ResumeProcessesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ResumeProcessesResponseUnmarshaller.Instance;
    return Invoke<ResumeProcessesResponse>(request, options);
}
}