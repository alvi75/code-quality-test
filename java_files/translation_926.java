import java.util.*;

public class Translation926 {
    1. Replace all occurrences of "public virtual" with "public TerminateJobResult terminateWorkflowTermination(terminateJobRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = TerminateJobRequestMarshaller.Instance;
    options.ResponseUnmarshaller = TeritanceResponseUnmarshaller.Instance;
    return Invoke<TerminateWorkspacesConnectionResponse>(request, options);
}
}