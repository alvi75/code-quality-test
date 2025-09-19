import java.util.*;

public class Translation509 {
    public ResumeProcessesResponse resumeResumeProcessesResponse ResumeProcessesResponse(ResumeProcessesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ResumeProcessesResponseUnmarshaller.Instance;
    options.ResponseUnmarshaller = ResumeProcessesResponseUnmarshaller.Instance;
    return Invoke<ResumeProcessesResponse>(request, options);
}
}