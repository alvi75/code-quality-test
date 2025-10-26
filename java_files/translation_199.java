import java.util.*;

public class Translation199 {
    ublic DeleteLifecyclePolicyResponse DeleteLifecyclePolicy(DeleteLifecyclePolicyRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteLifecyclePolicyRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteLifecyclePolicyResponseUnmarshaller.Instance;
    return Invoke<DeleteLifecyclePolicyResponse>(request, options);
}
}