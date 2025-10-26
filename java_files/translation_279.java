import java.util.*;

public class Translation279 {
    ublic StopCompilationJobResponse StopCompilationJob(StopCompilationJobRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StopCompilationJobRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StopCompilationJobResponseUnmarshaller.Instance;
    return Invoke<StopCompilationJobResponse>(request, options);
}
}