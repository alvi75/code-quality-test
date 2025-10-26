import java.util.*;

public class Translation279 {
    public StopCompilationJob(StopCompilationJobRequest request) {
    base(request);
}
internal virtual StopCompilationJobResponse StopCompilationJobInternal(StopCompilationJobRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StopCompilationJobRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StopCompilationJobResponseUnmarshaller.Instance;
    return Invoke<StopCompilationJobResponse>(request, options);
}
}