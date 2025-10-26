import java.util.*;

public class Translation352 {
    ublic CreateTrafficPolicyInstanceResponse CreateTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateTrafficPolicyInstanceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateTrafficPolicyInstanceResponseUnmarshaller.Instance;
    return Invoke<CreateTrafficPolicyInstanceResponse>(request, options);
}
}