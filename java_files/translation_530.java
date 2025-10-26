import java.util.*;

public class Translation530 {
    ublic GetDeploymentTargetResponse GetDeploymentTarget(GetDeploymentTargetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetDeploymentTargetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDeploymentTargetResponseUnmarshaller.Instance;
    return Invoke<GetDeploymentTargetResponse>(request, options);
}
}